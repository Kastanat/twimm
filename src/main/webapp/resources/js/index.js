$(document).ready(function() {

  var lista = [
    "Dokumentointi",
    "XML",
    "CSS",
    "Tietokannat",
    "HTML",
    "UI suunnittelu",
    "Javascript",
    "SQL",
    ".NET",
    "C#",
    "Python",
    "iOS",
    "PHP",
    "Java",
    "Android",
    "Java EE",
    "Spring",
    "Drupal",
    "C",
    "MongoDB",
    "jQuery",
    "Ruby",
    "Scala",
    "Ruby on Rails",
    "Node.js",
    "Maven",
    "Rest",
    "C++",
    "Angular.js"
  ];

  var i = 0;
  var yes = "yes";
  var aihe = lista[0];
  var kiinnostavat = [];
  $(".tinder").hide();
  $(".lomake").hide();
  $(".alkaa").click(function() {
    $(".aloitus").hide();
    $(".tinder").show();
    $("#teksti").html(aihe);
  });
  
  
  $('.nappi').click(function(){
    i++;
    aihe = lista[i];
    $('#teksti').html(aihe);
    if(i === lista.length) {
      $(".tinder").hide();
      var text = kiinnostavat.join("<br>");
      $(".kiinnostavat").html("<h1>Sinua kiinnostivat: </h1><br><br>" + text);
      $(".lomake").show();
      
    } else if ($(this).val() === yes) {
      kiinnostavat.push(lista[i - 1]);
    }  
  });
});