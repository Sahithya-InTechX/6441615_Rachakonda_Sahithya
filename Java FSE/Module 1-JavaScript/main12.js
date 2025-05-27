document.getElementById("registrationForm").addEventListener("submit", function (event) {
  event.preventDefault();

  const form = event.target;
  const userData = {
    name: form.name.value,
    email: form.email.value
  };

  document.getElementById("message").textContent = "Submitting...";

  // Simulate POST request with setTimeout and fetch
  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      body: JSON.stringify(userData),
      headers: {
        "Content-type": "application/json; charset=UTF-8"
      }
    })
      .then(response => response.json())
      .then(data => {
        console.log("Server response:", data);
        document.getElementById("message").textContent = "Registration successful!";
      })
      .catch(error => {
        console.error("Error:", error);
        document.getElementById("message").textContent = "Registration failed.";
      });
  }, 1500); // simulate delay
});
