const form = document.getElementById("registrationForm");
const messageDiv = document.getElementById("message");

form.addEventListener("submit", (event) => {
  event.preventDefault();

  const name = form.elements["name"].value.trim();
  const email = form.elements["email"].value.trim();
  const selectedEvent = form.elements["event"].value;

  if (!name || !email || !selectedEvent) {
    messageDiv.textContent = "Please fill in all fields.";
    messageDiv.style.color = "red";
    return;
  }

  // Simple email validation
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailPattern.test(email)) {
    messageDiv.textContent = "Please enter a valid email.";
    messageDiv.style.color = "red";
    return;
  }

  messageDiv.textContent = `Thank you, ${name}, for registering for ${selectedEvent}.`;
  messageDiv.style.color = "green";

  form.reset();
});
