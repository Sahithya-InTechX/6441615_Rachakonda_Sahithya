const events = [
  { name: "Yoga Class", date: "2025-05-01", seats: 10 },
  { name: "Cooking Workshop", date: "2023-03-01", seats: 0 },
  { name: "Music Festival", date: "2025-07-20", seats: 50 }
];

const today = new Date();

function displayEvents() {
  const ul = document.getElementById("eventList");
  ul.innerHTML = "";

  events.forEach(event => {
    try {
      const eventDate = new Date(event.date);
      if (eventDate < today || event.seats <= 0) {
        return; // skip past or full events
      }
      const li = document.createElement("li");
      li.textContent = `${event.name} on ${event.date} (${event.seats} seats left)`;
      ul.appendChild(li);
    } catch (error) {
      console.error("Error processing event:", event.name, error);
    }
  });
}

displayEvents();
