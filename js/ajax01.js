$ajax({
    type: "post",
    contentType: "application/json",
    url: "",
    data: JSON.stringify(searchData),
    dataType: "json",
    timeout: 100000,
    success: function (data) {

    },
    error: function (error) {
        console.log(error);
    }
});