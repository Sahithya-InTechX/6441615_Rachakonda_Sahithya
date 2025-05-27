const events = [
  { name: "Music Festival", category: "music" },
  { name: "Cooking Class", category: "cooking" }
];

// Add new event
events.push({ name: "Yoga Session", category: "health" });

// Filter music events
const musicEvents = events.filter(event => event.category === "music");

// Map to display cards format
const eventCards = events.map(event => `Event: ${event.name} (${event.category})`);

const ul = document.getElementById("eventList");
ul.innerHTML = "";

// Display all events as list items
eventCards.forEach(card => {
  const li = document.createElement("li");
  li.textContent = card;
  ul.appendChild(li);
});
