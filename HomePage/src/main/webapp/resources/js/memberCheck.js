$().ready(function(){
	
	
	
	
	 $("#idCheck").on('click',function(){
		$.ajax({
			url : "idCheck",
			type : "get",
			data : {
				userid : $("#inputUserId").val()
			},
			success : function(result){
				if(result == 1){
					alert("아이디가 중복되었습니다");
				} else {
					alert("사용가능한 아이디입니다.");
				}
		}
	}) //ajax
})	//idCHeck (중복체크)
	
		$("#memberJoin").on('click',function(){
			var userPasswd = $("#inputUserPassword").val();
			var userPasswdCheck = $("#inputUserPasswordCheck").val();
			var userid = $("#inputUserId").val();
			var userName = $("#inputUserName").val();
			var rgExp_kr = /([^가-힣ㄱ-ㅎㅏ-ㅣ\x20])/i;;
			
			if(userName.length == 0){
				alert('이름을 입력하세요');
				$("#inputUserName").focus();
				return false;
			} else if(rgExp_kr.test(userName)){
				alert("한글만 입력하세요");
				$("#inputUserName").focus();
				return false;
			} else if(userName.length < 2 || userName.length > 5) {
				alert("2글자 ~ 4글자 사이로 입력하세요");
				$("#inputUserName").focus();
				return false;
			} else if (userid.length == 0){
				alert("아이디를 입력하세요.");
				$("#inputUserId").focus();
				return false;
			} else if (userPasswd.length == 0){
				alert("비밀번호를 입력하세요.");
				$("#inputUserPassword").focus();
				return false;
			} else if (userPasswdCheck.length == 0){
				alert("비밀번호 확인란을 입력하세요");
				$("#inputUserPasswordCheck").focus();
				return false;
			}
			
			
			var params = $("#memberForm").serialize();
				$.ajax({
					
					url : "memberJoin",
					type : "post",
					data : params,
					success : function(result){
						if(result == true){
							alert("회원가입이 완료되었습니다.");
							location.href="/dddd/"
						} else {
							alert("아이디가 중복되었습니다.");
							$("#inputUserId").focus();
						}
					}
				})
	}); //회원가입
});
	
	