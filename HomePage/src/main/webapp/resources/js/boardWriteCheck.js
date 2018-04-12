$().ready(function(){
	
	$('#boardCancel').on('click',function(){
		
		location.href='boardForm';
	});
	
	$('#boardSave').on('click',function(){
		var params = $('#boardWriteForm').serialize();
		$.ajax({
			url : "/dddd/loginAfter/boardWrite",
			type : "get",
			data : params,
			success : function(result){
				if(result){
					alert('글 등록이 완료되었습니다.');
				}
				
				location.href = "/dddd/loginAfter/boardForm";
			}
		})
	})
});
