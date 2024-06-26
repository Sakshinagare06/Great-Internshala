package drone;

import java.io.IOException;

import Webcams.DisplayImage;
import users.Police;

public class PoliceDrone extends Drone implements Surveillance
{
	public PoliceDrone(String name, String model_number, String location) throws Exception
	{
		super(name,model_number,location);
	}

	public void informPolice(Object a)
	{
		Police.addInbox(a);
	}

	@Override
	public void showImage(String a) throws IOException
	{
		DisplayImage.displayImage(a);
	}


	
}
