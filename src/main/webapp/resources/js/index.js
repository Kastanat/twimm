$(document).ready(function() {

 
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