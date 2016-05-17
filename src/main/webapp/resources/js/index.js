$(document).ready(function() {
 
  var i = 0;
  var yes = "yes";
  var aihe = lista[i];
  var kiinnostavat = [];
  var kiinnostavatId = [];
  
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
    	kiinnostavatId.push(idLista[i]);
    }  
    i++;
    $('#teksti').html(lista[i]);
    if(i === lista.length) {
        $(".tinder").hide();
        var text = kiinnostavat.join("<br>");
        var idt = kiinnostavatId.join(",");
        $(".kiinnostavat").html("<h1>Sinua kiinnostivat: </h1><br><br>" + text);
        $(".lomake").show();
        
        var json = {"kaikkiIdt" : idt};
	       
	    $.ajax({
	    	url: "kayttajat/talletakiinnostukset",
	        data: JSON.stringify(json),
	        type: "POST",
	         
	        beforeSend: function(xhr) {
	            xhr.setRequestHeader("Accept", "application/json");
	            xhr.setRequestHeader("Content-Type", "application/json");
	        }
	    });
    }
  });
});

