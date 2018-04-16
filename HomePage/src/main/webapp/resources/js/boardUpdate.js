$().ready(function(){
	$('#boardListForm').on('click',function(){
		location.href="/dddd/loginAfter/boardForm";
	});
	
	$('#boardUpdate').on('click',function(){
		var params = $('#boardRetrieveForm').serialize();
		$.ajax({
			url : "/dddd/loginAfter/boardUpdate",
			type : "get",
			data : params,
			success : function(result){
				if(result){
					alert("내용 수정이 완료되었습니다.");
				}
				
				location.href="/dddd/loginAfter/boardForm";
			}
		})
	});
});