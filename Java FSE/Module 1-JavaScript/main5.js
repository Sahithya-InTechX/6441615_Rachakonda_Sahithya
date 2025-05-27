function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function() {
  return this.seats > 0 ? "Seats available" : "Full";
};

const event1 = new Event("Art Expo", "2025-09-15", 30);
const event2 = new Event("Tech Meetup", "2025-10-05", 0);

const entries = Object.entries(event1);

document.getElementById("output").textContent =
  `Event 1 Availability: ${event1.checkAvailability()}\n` +
  `Event 2 Availability: ${event2.checkAvailability()}\n` +
  `Event 1 Details:\n${entries.map(e => e.join(": ")).join("\n")}`;
