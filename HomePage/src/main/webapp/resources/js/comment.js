$().ready(function(){
	
	$('#commentSubmit').on('click',function(){
		
		var commentAuthor = $('#commentAuthor').val();
		var commentPasswd = $('#commentPasswd').val();
		var commentContent = $('#commentContent').val();
		var num = $('#inputNum').val();
		
		var data = {
				"num" : num,
				"commentAuthor" : commentAuthor,
				"commentPasswd" : commentPasswd,
				"commentContent" : commentContent
		};
		
		if(commentPasswd.length == 0){
			alert("비밀번호를 입력하세요");
			$('#commentPasswd').focus();
			return false;
		} else {
			$.ajax({
				url : "commentWrite",
				type : "post",
				data : data,
				success : function(result){
					if(result){
						alert("댓글이 등록되었습니다.");
						$('#commentPasswd').val("");
						$('#commentContent').val("");
						location.href="boardRetrieve?num="+num;
					} //if
				} // success
			}); //Ajax
		}
	}); //onclick
}); //end