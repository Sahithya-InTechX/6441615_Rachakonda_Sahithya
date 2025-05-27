const eventName = "Community Cleanup";
const eventDate = "2025-06-10";
let availableSeats = 20;

availableSeats--;  // One seat taken

const eventInfo = `Event: ${eventName}, Date: ${eventDate}, Seats Left: ${availableSeats}`;

console.log(eventInfo);

document.getElementById("eventDetails").textContent = eventInfo;
