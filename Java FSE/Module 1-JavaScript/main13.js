const form = document.getElementById("registrationForm");
const logDiv = document.getElementById("log");

form.addEventListener("submit", (e) => {
  e.preventDefault();
  logDiv.textContent = "";

  const name = form.elements["name"].value;
  const email = form.elements["email"].value;

  console.log("Form submitted with:", { name, email });

  if (!name || !email) {
    logDiv.textContent = "Please fill in all fields.";
    console.warn("Validation failed");
    return;
  }

  // Simulate fetch request
  fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify({ name, email }),
    headers: { "Content-Type": "application/json" },
  })
    .then(res => {
      console.log("Fetch response status:", res.status);
      if (!res.ok) throw new Error("Fetch failed");
      return res.json();
    })
    .then(data => {
      logDiv.textContent = "Registration successful!";
      console.log("Fetch success:", data);
    })
    .catch(err => {
      logDiv.textContent = "Error submitting registration.";
      console.error(err);
    });
});
