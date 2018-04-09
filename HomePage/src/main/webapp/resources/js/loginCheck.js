$().ready(function(){
	$("#loginCancle").on('click',function(){
		location.href="/dddd";
	});
	
	$("#loginCheck").on('click',function(){
		var params = $("#loginForm").serialize();
		$.ajax({
			url : "loginCheck",
			type : "post",
			data : params,
			success : function(result){
				if(result == true){
					location.href="/dddd";
				} else {
					alert("계정정보가 올바르지 않습니다.");
				}
			}
		}); //ajax
	}); //loginCheck
});
	
	