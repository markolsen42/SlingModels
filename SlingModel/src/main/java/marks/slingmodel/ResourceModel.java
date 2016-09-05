package marks.slingmodel;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

@Model(adaptables = Resource.class)
public class ResourceModel {

    @Inject @Optional @Default(values="there is no name !")
    private String firstName;
//    private String value;
    @Inject @Named("jcr:title")
    private String title;

//    @PostConstruct
//    public void activate() {
//        value = "Hi! " + firstName;
//    }

//    public String getValue() {
//        return value;
//    }
    
    public String getName(){
    	return firstName;
    }
    
    public String getTitle(){
    	return title;
    }
}
