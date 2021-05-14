btn1.addEventListener("click", () => {
    let url = "http://localhost:7000/customers/"+document.querySelector('#acctstat').value;
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