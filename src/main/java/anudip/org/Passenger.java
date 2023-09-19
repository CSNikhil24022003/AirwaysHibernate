package anudip.org;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int pid;
		private String pname;		
		@ManyToMany(mappedBy="Passenger")		
		Set<AirWays> AirWaysSet=new HashSet<AirWays>();
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public Set<AirWays> getAirWaysSet() {
			return AirWaysSet;
		}
		public void setAirWaysSet(Set<AirWays> airWaysSet) {
			AirWaysSet = airWaysSet;
		}
		public Passenger() {
			super();		
		}							
}