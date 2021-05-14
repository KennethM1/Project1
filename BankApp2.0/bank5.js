const emp = JSON.parse(localStorage.getItem("emp1"));

//console.log("Heres   " + user[0].customer_name);
//console.log("Checking Bal: "+ user[0].checking_account);
document.getElementById("welc").innerText = (emp[0].employee_name).toUpperCase();

btn1.addEventListener("click", () => {
    let url = "http://localhost:7000/customers";
    fetch(url)
        .then(res => res.json())
        .then(res1 => {
            console.log(res1)
            let data = "<table class='table table-bordered table-striped'><thead class='thead-dark'><tr><th>Employee Name</th><th>Employee ID</th><th>Account ID</th><th>Account Status</th><th>Checking Balance</th><th>Savings Balance</th></tr></thead>";
            res1.forEach(element => {
                data = data + "<tr><td>" + element.customer_name + "</td>"
                data = data + "<td>" + element.customer_id + "</td>"
                data = data + "<td>" + element.account_id + "</td>"
                data = data + "<td>" + element.account_approval + "</td>"
                data = data + "<td>" + element.checking_account + "</td>"
                data = data + "<td>" + element.savings_account +"</td></tr>"
                //data = data + "<td><img class='rounded' height='100px' width='100px' src='" + element.avatar_url + "'/></td></tr>"
            });
            data = data + "</table>"
            document.getElementById("results").innerHTML = data;
        });

    })


    bt4.addEventListener("click", () => {
      let url = "http://localhost:7000/employee/deny";
      fetch(url, {
        method: "POST",
        body: JSON.stringify({
          account_id: document.getElementById("deny").value,
        }),
        headers: {
          "Content-type": "application/json; charset=UTF-8",
        },
      })
        .then((response) => response.json())
        .then((json) => {
          console.log(json);
        });
    });

    btn3.addEventListener("click", () => {
        let url = "http://localhost:7000/employee/approve";
        fetch(url, {
          method: "POST",
          body: JSON.stringify({
            account_id: document.getElementById("approve").value,
          }),
          headers: {
            "Content-type": "application/json; charset=UTF-8",
          },
        })
          .then((response) => response.json())
          .then((json) => {
            console.log(json);
          });
      });

      console.log("hello you")

      btn7.addEventListener("click", () => {

        let url = "http://localhost:7000/newemployee";
        fetch(url, {
          method: 'POST',
          body: JSON.stringify({
            employee_name: document.getElementById("name").value,
            employee_id: document.getElementById("empid").value,
            employee_pass: document.getElementById("pwd").value,
          }),
          headers: {
            "Content-type": "application/json; charset=UTF-8"
          },
        })
          .then((response) => response.json())
          .then((json) =>{
             
              console.log(json.customer_id);
            if(json!==null){
            alert("Let's welcome "+(document.getElementById("name").value).toUpperCase+" to the TBofK Team!!!" );}
            
        });
          
      });

