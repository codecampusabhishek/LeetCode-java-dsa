// Time Needed To Buy Tickets

class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for(int current=0; current<tickets.length; current++){
            if(current <= k){
                time = time + Math.min(tickets[current], tickets[k]);
            } else{
                time = time + Math.min(tickets[current], tickets[k] - 1);
            }
        }
        return time;
    }
}