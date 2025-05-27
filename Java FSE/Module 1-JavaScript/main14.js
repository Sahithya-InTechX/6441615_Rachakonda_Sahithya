$(document).ready(function () {
  $("#showEvents").click(function () {
    $(".eventCard").fadeIn();
  });

  $("#hideEvents").click(function () {
    $(".eventCard").fadeOut();
  });

  // Benefit of frameworks like React or Vue: Component-based architecture for reusable UI
  console.log("Frameworks like React/Vue help with reusable components and state management.");
});
