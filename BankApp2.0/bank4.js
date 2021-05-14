b1.addEventListener("click", () => {

    let url = "http://localhost:7000/employee/login";
    fetch(url, {
      method: 'POST',
      body: JSON.stringify({
        employeeID: document.getElementById("emp").value,
        employee_pass: document.getElementById("pass").value,
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      },
    })
      .then((response) => response.json())
      .then((json) =>{
         
          console.log(json);
          console.log(typeof(json))
          if(json[0]==null){
              alert("The Employee ID and Password entered does not match our records");
              setTimeout(function(){window.location.href="employeeloginpage.html"},1000);
          }
          else{setTimeout(function(){window.location.href="employeepage.html"},1000);}
  
          localStorage.setItem("emp1", JSON.stringify(json));
         
    //   if(json[0].customer_id!==null){
          
    //       console.log("I think we're getting somewherre");
    //       setTimeout(function(){window.location.href="customerfrontpage.html"},5000);
    //   }
    //   else{alert("Customer ID and Password do not match our records")}
      
    //   setTimeout(function(){console.log("hi")},5000);
  });
  
  
  
  });
  const emp = JSON.parse(localStorage.getItem("emp1"));
//   console.log("Heres   "+user[0].customer_id)
