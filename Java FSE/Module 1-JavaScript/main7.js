const events = [
  { name: "Community Cleanup", seats: 10 },
  { name: "Art Workshop", seats: 0 }
];

const container = document.querySelector("#eventsContainer");
container.innerHTML = "";

events.forEach(event => {
  const card = document.createElement("div");
  card.className = "eventCard";

  card.innerHTML = `
    <h2>${event.name}</h2>
    <p>Seats available: ${event.seats}</p>
    <button ${event.seats === 0 ? "disabled" : ""}>Register</button>
  `;

  container.appendChild(card);
});
