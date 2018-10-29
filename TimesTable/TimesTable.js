
class TimesTablePrinting extends React.Component {
    render() {
        

        var myelements=[];
        for(var i=0;i<=this.props.R;i++){// push() adds an element to the array myelement for each loop
            
            
            
            myelements.push(React.createElement("h3",{style:{"color":this.props.C}},this.props.T + " x "+i+"=" +(this.props.T*i)));
        }
        var component=React.createElement("QA",null,myelements);
        return  component;
    }
    
}




