
fetch("http://localhost:8080/api/users")
    .then( res => {
        res.json().then(
            data => {
                console.log(data);
                let temp="";
                data.forEach((u)=>{
                    temp += "<tr>"
                    temp += "<td>" + u.id + "</td>"
                    temp += "<td>" + u.name + "</td>"
                    temp += "<td>" + u.age + "</td>"
                    temp += "<td>" + u.email + "</td>"
                    temp += "<td>" + u.nameRole + "</td>"
                    temp += "<td><button type='button' class='btn btn-primary' id='open-popup1'>Edit</button></td>"
                    temp += "<td><button type='button' class='btn btn-danger' id='open-popup1'>Delete</button></td>"
                })
                document.querySelector(".table-panel-tbody").innerHTML = temp;
            })
})


$(document).on("click", "#open-popup1", function (){
        $("#popup").show();
    })

$(document).ready(function (){
    $("#close-popup").click(function (){
        $("#popup").hide();
    })
})

