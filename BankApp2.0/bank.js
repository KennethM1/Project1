function pageRedirect(){window.location.href="customerfrontpage.html"}
b1.addEventListener("click", () => {

  let url = "http://localhost:7000/customer/login";
  fetch(url, {
    method: 'POST',
    body: JSON.stringify({
      customer_id: document.getElementById("cust").value,
      customer_pass: document.getElementById("pass").value,
    }),
    headers: {
      "Content-type": "application/json; charset=UTF-8"
    },
  })
    .then((response) => response.json())
    .then((json) =>{
       
        console.log(json[0].customer_id);

        localStorage.setItem("user", JSON.stringify(json));
       
    if(json[0].customer_id!==null){
        
        console.log("I think we're getting somewherre");
        setTimeout(function(){window.location.href="customerfrontpage.html"},5000);
    }
    else{alert("Customer ID and Password do not match our records")}
    
    setTimeout(function(){console.log("hi")},5000);
});



});
const user = JSON.parse(localStorage.getItem("user"));
console.log("Heres   "+user[0].customer_id)