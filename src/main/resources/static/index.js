

  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");



  var requestOptions = {
    method: 'GET',
    headers: myHeaders,

    redirect: 'follow'
  };

  fetch("http://localhost:8080/api/v1/player", requestOptions)
    .then(response => response.json())
    .then((result) => {
      result.forEach(object => {
      let div = document.getElementById("playerscolum")
      div.innerHTML +="<h3 style='color :red'>Player ID : "+object.id+"</h3>"
      div.innerHTML += "name is :"+ object.name +"          nationality is:" +object.nationality
      div.innerHTML +="<br />"
    });


    })
    .catch(error => console.log('error', error))

//add player function
//get most code from postmangit
    function addPlayer(){
    var myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    var raw = JSON.stringify({
      "name": document.getElementById("name").value,
      "age":document.getElementById("age").value ,
      "nationality": document.getElementById("nationality").value
    });

    var requestOptions = {
      method: 'POST',
      headers: myHeaders,
      body: raw,
      redirect: 'follow'
    };

    fetch("http://localhost:8080/api/v1/player", requestOptions)
      .then(response => response.text())
      .then(result => console.log(result))
      .catch(error => console.log('error', error));

    }
//updateForm
let playerUpdateForm = document.getElementById("updateForm");
playerUpdateForm.addEventListener("submit", (event) => {
  event.preventDefault();
 let id = document.getElementById("uid").value;
 let name = document.getElementById("uname").value;
 let age = document.getElementById("uage").value;
   let nationality = document.getElementById("unationality").value;

  alert(id + " id "   +   name + "name "  + age   );


  var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

var raw = JSON.stringify({
"id":id,
  "name": name,
  "age": age,
 "nationality": nationality
});

var requestOptions = {
  method: 'PUT',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};

fetch("http://localhost:8080/api/v1/player/"+id, requestOptions)
  .then(response => response.json())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
})

function deletePlayer(){
var id = document.getElementById("dltid").value;
alert (id)


}

let playerRegForm = document.getElementById("playerDelForm");
playerRegForm.addEventListener("submit", (event) => {
  event.preventDefault();

  var id = document.getElementById("dltid").value;
  alert (id)

  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");
  

  
  var requestOptions = {
    method: 'DELETE',
    headers: myHeaders,
    redirect: 'follow'
  };
  
  fetch("http://localhost:8080/api/v1/player/"+id, requestOptions)
    .then(response => response.text())
    .then(result => console.log(result))
    .catch(error => console.log('error', error));

})


