class tabSwitcher {
    constructor(id) {
        this.id = id;
        this.node = null;
    }

    get create() {
        let temp = document.getElementsByTagName("template")[0];
        let clon = temp.content.cloneNode(true);

        clon.id = this.id;
        this.node = clon;
        
        document.body.appendChild(clon);
        return clon;
    }

    switchTab(event) {
        let index = event.target.value;
        this.node.querySelector("#" + "tabContent-" + index);
        
    }

}



function create() {
    
}



function showContent() {

}

// showContent();