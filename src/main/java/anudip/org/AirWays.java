package anudip.org;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
@Entity 
public class AirWays {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String PlaneName;
	@ManyToMany
	@JoinTable(name = "AirWay_Transport", joinColumns = @JoinColumn(name = "aid"), inverseJoinColumns = @JoinColumn(name = "pid"))
	private Set<Passenger> Passenger = new HashSet<Passenger>();
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getPlaneName() {
		return PlaneName;
	}
	public void setPlaneName(String planeName) {
		PlaneName = planeName;
	}
	public Set<Passenger> getPassenger() {
		return Passenger;
	}
	public void setPassenger(Set<Passenger> passenger) {
		Passenger = passenger;
	}
	public AirWays() {
		super();
	}					
}