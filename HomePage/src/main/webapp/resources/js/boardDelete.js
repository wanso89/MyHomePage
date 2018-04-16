$().ready(function(){
	$('#boardDelete').on('click',function(){
		var param = $('#inputNum').val();
		console.log(param);
		$.ajax({
			url : "/dddd/loginAfter/boardDelete?num="+param,
			type : "post",
			success : function(result){
				if(result){
					alert('글 삭제가 완료되었습니다.');
					location.href="/dddd/loginAfter/boardForm";
				}
			}
		});
	});
	
	
	
	
	
	
});