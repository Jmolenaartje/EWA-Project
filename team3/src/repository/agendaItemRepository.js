export default class AgendaItemRepository {
    async getAgendaItems(){
        const response = await fetch('http://localhost:8089/agenda-items/');
        return await response.json();
    }

    async pushAgendaItem(capacity, description, endDate, gameLevel, leader, location, startDate, title){
        let userId = 1;
        const response = await fetch('http://localhost:8089/agenda-items/add', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({capacity, description, endDate, gameLevel,
                leader, location, startDate, title, userId}),
        });
        return await response.json();
    }
}