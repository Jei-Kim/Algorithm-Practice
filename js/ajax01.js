$ajax({
    type: "post", //post,get,delete,put
    contentType: "application/json", //전송할 데이터 타입
    url: "",
    async: "true", //true:비동기 / false:동기(응답이 있을 때까지 기다림)
    data: JSON.stringify(searchData),
    dataType: "json", //서버에서 반환되는 데이터 타입
    timeout: 100000, //제한시간(밀리초)
    chache: false, //기본값 false
    success: function (data) { //통신 성공 시 실행되는 ajax event
        console.log(data.d); //.net에서는 data.d로 읽어옴
    },
    error: function (error) { // 통신 실패 시 실행되는 ajax event
        console.log(error);
    }
});