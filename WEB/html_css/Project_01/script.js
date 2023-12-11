function message() {
  var firstName = document.getElementById("validationCustom01");
  var lastName = document.getElementById("validationCustom02");
  var email = document.getElementById("exampleFormControlInputEmail");
  var msg = document.getElementById("exampleFormControlTextarea1");
  const success = document.getElementById("success");
  const danger = document.getElementById("danger");

  if (
    firstName.value === "" ||
    lastName.value === "" ||
    email.value === "" ||
    msg.value === ""
  ) {
    danger.style.display = "block";
  } else {
    setTimeout(() => {
      firstName.value = "";
      lastName.value = "";
      email.value = "";
      msg.value = "";
    }, 2000);

    success.style.display = "block";
  }

  setTimeout(() => {
    danger.style.display = "none";
    success.style.display = "none";
  }, 4000);
}
