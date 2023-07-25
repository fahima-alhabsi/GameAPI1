

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


