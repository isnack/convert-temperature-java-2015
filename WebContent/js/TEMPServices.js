var tempServices={
  
  converter:function(temp,type,callback){
    
    
    
    $.ajax({
		  url: 'ConvertTemperaturesController',
		  data: {'temp': temp, 'type': type},
		  success: function(result) {
		  	callback(result);
		  },
		  error: function() {
		  	callback(null);
		  }
		});
   
  },
  
  description:function(tempConverted,type){
   var result="0";
    tempConverted =tempConverted.toFixed(2);
    //se a temperatura informada for  fahrenheit converte para celsius
     if(type=="fahrenheit"){
      result=tempConverted+" ºC";
      
    }else{
      result=tempConverted+" ºF";
    } 
    return result;
  }    
};