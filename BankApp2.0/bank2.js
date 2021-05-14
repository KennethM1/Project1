
//Post Method that sets new customer's initial values in Customer Table 
const x = Math.floor(Math.random()*900);
 btn4.addEventListener("click", () => {
    let url = "http://localhost:7000/customer2";
    fetch(url, {
        method: 'POST',
        body: JSON.stringify({
          customer_name: document.getElementById("f1").value,
          customer_id: x,//generated randomly
          customer_age: document.getElementById("f2").value,
          customer_pass: document.getElementById("f3").value,
        }),
        headers: {
          'Content-type': 'application/json; charset=UTF-8',
        },
      })
        .then((response) => response.json())
        .then((json) => {
       
            console.log(json);
            console.log(json.customer_id)
        localStorage.setItem("custid", JSON.stringify(json));//stores previously generated json results for later use

    });

//Post Method that pushes data to BankAccounts Table
const user = JSON.parse(localStorage.getItem("custid"));//for previous data retrival
// btn4.addEventListener("click", () => {
    const y=Math.floor(Math.random()*900);
    setTimeout(function(){
        let url = "http://localhost:7000/customer3";
        fetch(url, {
            method: 'POST',
            body: JSON.stringify({
              customer_name: document.getElementById("f1").value,
              account_id: y,//generated randomly
              checking_account: document.getElementById("f4").value,
              customer_id: x,//reuse of previously fetched data from local storage
              savings_account: document.getElementById("f5").value
            }),
            headers: {
              'Content-type': 'application/json; charset=UTF-8',
            },
          })
            .then((response) => response.json())
            .then((json) =>{ 
                
                console.log(json);
            localStorage.setItem("acctinfo", JSON.stringify(json));
     });
    
    }, 4000)
    // localStorage.setItem("acctinfo", JSON.stringify(json));
    const user1 = JSON.parse(localStorage.getItem("acctinfo"));
    setTimeout(function(){alert("Please allow your account to be reviewed by our staff here at TBoK\n"+"Your new Account ID is: "+user1.account_id+"and\n"+"Your new Customer ID is: "+user1.customer_id)},6000 )
 });