const container = document.getElementById("eventsContainer");
const loading = document.getElementById("loading");

function fetchEvents() {
  loading.style.display = "block";
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve([
        { name: "Marathon", date: "2025-06-10" },
        { name: "Book Fair", date: "2025-07-20" }
      ]);
    }, 2000);
  });
}

// Using then/catch
fetchEvents()
  .then(events => {
    loading.style.display = "none";
    container.innerHTML = events.map(e => `<div>${e.name} on ${e.date}</div>`).join("");
  })
  .catch(error => {
    loading.style.display = "none";
    container.textContent = "Error loading events.";
    console.error(error);
  });

// Using async/await example (comment out above for testing)
/*
async function loadEvents() {
  try {
    loading.style.display = "block";
    const events = await fetchEvents();
    loading.style.display = "none";
    container.innerHTML = events.map(e => `<div>${e.name} on ${e.date}</div>`).join("");
  } catch (error) {
    loading.style.display = "none";
    container.textContent = "Error loading events.";
    console.error(error);
  }
}
loadEvents();
*/
