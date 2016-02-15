var lastName  = "";
var firstName  = "";
var phoneNo  = "";
$(document).ready function()({
	$("#submit").click(function(){
		alert();
		lastName =$("#lastName").val();
		firstName =$("#firstName").val();
        	phoneNo =$("#phoneNo").val();
		$.ajax({
			url: "Studentcontroller",
			data:{
 				lastName,
				firstName,
				phoneNo
			},		
			method:"post",
			/*success: function(result){
			        console.log(result);
				alert("welcome");*/
	        }
	});
   
});
