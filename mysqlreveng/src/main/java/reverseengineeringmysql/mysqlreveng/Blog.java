package reverseengineeringmysql.mysqlreveng;
// Generated May 19, 2017 3:42:08 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Blog generated by hbm2java
 */
@Entity
@Table(name = "blog", catalog = "mydb")
public class Blog implements java.io.Serializable {

	private Integer blogId;
	private String blogTitle;
	private String blogContent;
	private String blogProgLang;
	private String blogTags;
	private Integer blogStatus;
	private Date blogCreated;
	private Date blogUpdated;
	private String blogAuthorName;
	private Integer blogAuthorId;
	private Set<Tag> tags = new HashSet<Tag>(0);
	private Set<Comment> comments = new HashSet<Comment>(0);

	public Blog() {
	}

	public Blog(String blogTitle, String blogContent, String blogProgLang, String blogTags, Integer blogStatus,
			Date blogCreated, Date blogUpdated, String blogAuthorName, Integer blogAuthorId, Set<Tag> tags,
			Set<Comment> comments) {
		this.blogTitle = blogTitle;
		this.blogContent = blogContent;
		this.blogProgLang = blogProgLang;
		this.blogTags = blogTags;
		this.blogStatus = blogStatus;
		this.blogCreated = blogCreated;
		this.blogUpdated = blogUpdated;
		this.blogAuthorName = blogAuthorName;
		this.blogAuthorId = blogAuthorId;
		this.tags = tags;
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "BLOG_ID", unique = true, nullable = false)
	public Integer getBlogId() {
		return this.blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	@Column(name = "BLOG_TITLE")
	public String getBlogTitle() {
		return this.blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	@Column(name = "BLOG_CONTENT")
	public String getBlogContent() {
		return this.blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	@Column(name = "BLOG_PROG_LANG", length = 50)
	public String getBlogProgLang() {
		return this.blogProgLang;
	}

	public void setBlogProgLang(String blogProgLang) {
		this.blogProgLang = blogProgLang;
	}

	@Column(name = "BLOG_TAGS")
	public String getBlogTags() {
		return this.blogTags;
	}

	public void setBlogTags(String blogTags) {
		this.blogTags = blogTags;
	}

	@Column(name = "BLOG_STATUS")
	public Integer getBlogStatus() {
		return this.blogStatus;
	}

	public void setBlogStatus(Integer blogStatus) {
		this.blogStatus = blogStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BLOG_CREATED", length = 19)
	public Date getBlogCreated() {
		return this.blogCreated;
	}

	public void setBlogCreated(Date blogCreated) {
		this.blogCreated = blogCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BLOG_UPDATED", length = 19)
	public Date getBlogUpdated() {
		return this.blogUpdated;
	}

	public void setBlogUpdated(Date blogUpdated) {
		this.blogUpdated = blogUpdated;
	}

	@Column(name = "BLOG_AUTHOR_NAME")
	public String getBlogAuthorName() {
		return this.blogAuthorName;
	}

	public void setBlogAuthorName(String blogAuthorName) {
		this.blogAuthorName = blogAuthorName;
	}

	@Column(name = "BLOG_AUTHOR_ID")
	public Integer getBlogAuthorId() {
		return this.blogAuthorId;
	}

	public void setBlogAuthorId(Integer blogAuthorId) {
		this.blogAuthorId = blogAuthorId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "blog")
	public Set<Tag> getTags() {
		return this.tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "blog")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

}
