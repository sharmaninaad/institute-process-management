package insproman;

import java.util.Arrays;
import java.util.Date;

public class Process {
		public Process(int id, String name, String description, int levels, Date date, int[] permission_ids) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.levels = levels;
		this.date = date;
		this.permission_ids = permission_ids;
	}
		public int id;
		private String name;
		private String description;
		private int levels;
		public boolean[] getPermitted() {
			return permitted;
		}
		public void setPermitted(boolean[] permitted) {
			this.permitted = permitted;
		}
		private Date date;
		private int[] permission_ids;
		private boolean[] permitted= {false};
		@Override
		public String toString() {
			return "Process [id=" + id + ", name=" + name + ", description=" + description + ", levels=" + levels
					+ ", date=" + date + ", permission_ids=" + Arrays.toString(permission_ids) + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getLevels() {
			return levels;
		}
		public void setLevels(int levels) {
			this.levels = levels;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public int[] getPermission_ids() {
			return permission_ids;
		}
		public void setPermission_ids(int[] permission_ids) {
			this.permission_ids = permission_ids;
		}
	
}
