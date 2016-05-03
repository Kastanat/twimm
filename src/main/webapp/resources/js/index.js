$(document).ready(function() {

 
  var i = 0;
  var yes = "yes";
  var aihe = lista[i];
  var kiinnostavat = [];
  
  $(".tinder").hide();
  $(".lomake").hide();
  $(".alkaa").click(function() {
    $(".aloitus").hide();
    $(".tinder").show();
    $("#teksti").html(lista[i]);
  });
  
  
  $('.nappi').click(function(){
    
    if ($(this).val() === yes) {
    	kiinnostavat.push(lista[i]);
    }  
    i++;
    $('#teksti').html(lista[i]);
    if(i === lista.length) {
        $(".tinder").hide();
        var text = kiinnostavat.join("<br>");
        $(".kiinnostavat").html("<h1>Sinua kiinnostivat: </h1><br><br>" + text);
        $(".lomake").show();
    }
  });
});

