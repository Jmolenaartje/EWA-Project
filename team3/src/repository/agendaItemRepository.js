export default class AgendaItemRepository {
    async getAgendaItems(){
        const response = await fetch('http://localhost:8089/agenda-items/');
        return await response.json();
    }
}