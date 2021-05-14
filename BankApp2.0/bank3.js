const user = JSON.parse(localStorage.getItem("user"));
console.log("Heres   " + user[0].customer_name);
console.log("Checking Bal: "+ user[0].checking_account);
document.getElementById("welc").innerText = (user[0].customer_name).toUpperCase();

//Establish new user credentials
let url = "http://localhost:7000/customer/login";
  fetch(url, {
    method: 'POST',
    body: JSON.stringify({
      customer_id: user[0].customer_id,
      customer_pass: user[0].customer_pass,
    }),
    headers: {
      "Content-type": "application/json; charset=UTF-8"
    },
  })
    .then((response) => response.json())
    .then((json) =>{
       
        console.log(json[0].customer_id);
        console.log(json[0].checking_account);

    
  
    

//setTimeout(establishUser(),5000);

//Get Account Details
btn1.addEventListener("click", () => {
  let data =
    "<table class='table table-bordered table-striped'><thead class='thead-dark'><tr><th>Account ID</th><th>Checking Account</th><th>Savings Account</th></tr></thead>";
  data = data + "<tr><td>" + user[0].customer_id + "</td>";
  data = data + "<td>" + json[0].checking_account + "</td>";
  data = data + "<td>" + json[0].savings_account + "</td>";

  data = data + "</table>";
  document.getElementById("results").innerHTML = data;
});

btn2.addEventListener("click", () => {
    let url = "http://localhost:7000/customer/depositchecking";
    fetch(url,{
        method: 'PUT',
        body: JSON.stringify({
          customer_id: user[0].customer_id,
          checking_account: document.getElementById("check").value ,
        }),
        headers: {
          'Content-type': 'application/json; charset=UTF-8',
        },
      })
        .then((response) => response.json())
        .then((json) => console.log(json));
});

btn3.addEventListener("click", () => {
    let url = "http://localhost:7000/customer/depositsaving";
    fetch(url,{
        method: 'PUT',
        body: JSON.stringify({
          customer_id: user[0].customer_id,
          savings_account: document.getElementById("save").value ,
        }),
        headers: {
          'Content-type': 'application/json; charset=UTF-8',
        },
      })
        .then((response) => response.json())
        .then((json) => console.log(json));
});

btn4.addEventListener("click", () => {
    let url = "http://localhost:7000/customer/withdrawchecking";
    fetch(url,{
        method: 'PUT',
        body: JSON.stringify({
          customer_id: user[0].customer_id,
          checking_account: document.getElementById("check2").value ,
        }),
        headers: {
          'Content-type': 'application/json; charset=UTF-8',
        },
      })
        .then((response) => response.json())
        .then((json) => console.log(json));
});

btn5.addEventListener("click", () => {
    let url = "http://localhost:7000/customer/withdrawsaving";
    fetch(url,{
        method: 'PUT',
        body: JSON.stringify({
          customer_id: user[0].customer_id,
          savings_account: document.getElementById("save2").value ,
        }),
        headers: {
          'Content-type': 'application/json; charset=UTF-8',
        },
      })
        .then((response) => response.json())
        .then((json) => console.log(json));
});




});