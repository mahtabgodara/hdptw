// ORM class for Movies
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Movies extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer movieid;
  public Integer get_movieid() {
    return movieid;
  }
  public void set_movieid(Integer movieid) {
    this.movieid = movieid;
  }
  public Movies with_movieid(Integer movieid) {
    this.movieid = movieid;
    return this;
  }
  private String movie_name;
  public String get_movie_name() {
    return movie_name;
  }
  public void set_movie_name(String movie_name) {
    this.movie_name = movie_name;
  }
  public Movies with_movie_name(String movie_name) {
    this.movie_name = movie_name;
    return this;
  }
  private String release_date;
  public String get_release_date() {
    return release_date;
  }
  public void set_release_date(String release_date) {
    this.release_date = release_date;
  }
  public Movies with_release_date(String release_date) {
    this.release_date = release_date;
    return this;
  }
  private String imdb_url;
  public String get_imdb_url() {
    return imdb_url;
  }
  public void set_imdb_url(String imdb_url) {
    this.imdb_url = imdb_url;
  }
  public Movies with_imdb_url(String imdb_url) {
    this.imdb_url = imdb_url;
    return this;
  }
  private Integer unknown_genre;
  public Integer get_unknown_genre() {
    return unknown_genre;
  }
  public void set_unknown_genre(Integer unknown_genre) {
    this.unknown_genre = unknown_genre;
  }
  public Movies with_unknown_genre(Integer unknown_genre) {
    this.unknown_genre = unknown_genre;
    return this;
  }
  private Integer action;
  public Integer get_action() {
    return action;
  }
  public void set_action(Integer action) {
    this.action = action;
  }
  public Movies with_action(Integer action) {
    this.action = action;
    return this;
  }
  private Integer adventure;
  public Integer get_adventure() {
    return adventure;
  }
  public void set_adventure(Integer adventure) {
    this.adventure = adventure;
  }
  public Movies with_adventure(Integer adventure) {
    this.adventure = adventure;
    return this;
  }
  private Integer animation;
  public Integer get_animation() {
    return animation;
  }
  public void set_animation(Integer animation) {
    this.animation = animation;
  }
  public Movies with_animation(Integer animation) {
    this.animation = animation;
    return this;
  }
  private Integer children;
  public Integer get_children() {
    return children;
  }
  public void set_children(Integer children) {
    this.children = children;
  }
  public Movies with_children(Integer children) {
    this.children = children;
    return this;
  }
  private Integer comedy;
  public Integer get_comedy() {
    return comedy;
  }
  public void set_comedy(Integer comedy) {
    this.comedy = comedy;
  }
  public Movies with_comedy(Integer comedy) {
    this.comedy = comedy;
    return this;
  }
  private Integer crime;
  public Integer get_crime() {
    return crime;
  }
  public void set_crime(Integer crime) {
    this.crime = crime;
  }
  public Movies with_crime(Integer crime) {
    this.crime = crime;
    return this;
  }
  private Integer documentary;
  public Integer get_documentary() {
    return documentary;
  }
  public void set_documentary(Integer documentary) {
    this.documentary = documentary;
  }
  public Movies with_documentary(Integer documentary) {
    this.documentary = documentary;
    return this;
  }
  private Integer drama;
  public Integer get_drama() {
    return drama;
  }
  public void set_drama(Integer drama) {
    this.drama = drama;
  }
  public Movies with_drama(Integer drama) {
    this.drama = drama;
    return this;
  }
  private Integer fantasy;
  public Integer get_fantasy() {
    return fantasy;
  }
  public void set_fantasy(Integer fantasy) {
    this.fantasy = fantasy;
  }
  public Movies with_fantasy(Integer fantasy) {
    this.fantasy = fantasy;
    return this;
  }
  private Integer film_noir;
  public Integer get_film_noir() {
    return film_noir;
  }
  public void set_film_noir(Integer film_noir) {
    this.film_noir = film_noir;
  }
  public Movies with_film_noir(Integer film_noir) {
    this.film_noir = film_noir;
    return this;
  }
  private Integer horror;
  public Integer get_horror() {
    return horror;
  }
  public void set_horror(Integer horror) {
    this.horror = horror;
  }
  public Movies with_horror(Integer horror) {
    this.horror = horror;
    return this;
  }
  private Integer musical;
  public Integer get_musical() {
    return musical;
  }
  public void set_musical(Integer musical) {
    this.musical = musical;
  }
  public Movies with_musical(Integer musical) {
    this.musical = musical;
    return this;
  }
  private Integer mystery;
  public Integer get_mystery() {
    return mystery;
  }
  public void set_mystery(Integer mystery) {
    this.mystery = mystery;
  }
  public Movies with_mystery(Integer mystery) {
    this.mystery = mystery;
    return this;
  }
  private Integer romance;
  public Integer get_romance() {
    return romance;
  }
  public void set_romance(Integer romance) {
    this.romance = romance;
  }
  public Movies with_romance(Integer romance) {
    this.romance = romance;
    return this;
  }
  private Integer sci_fi;
  public Integer get_sci_fi() {
    return sci_fi;
  }
  public void set_sci_fi(Integer sci_fi) {
    this.sci_fi = sci_fi;
  }
  public Movies with_sci_fi(Integer sci_fi) {
    this.sci_fi = sci_fi;
    return this;
  }
  private Integer thriller;
  public Integer get_thriller() {
    return thriller;
  }
  public void set_thriller(Integer thriller) {
    this.thriller = thriller;
  }
  public Movies with_thriller(Integer thriller) {
    this.thriller = thriller;
    return this;
  }
  private Integer war;
  public Integer get_war() {
    return war;
  }
  public void set_war(Integer war) {
    this.war = war;
  }
  public Movies with_war(Integer war) {
    this.war = war;
    return this;
  }
  private Integer western;
  public Integer get_western() {
    return western;
  }
  public void set_western(Integer western) {
    this.western = western;
  }
  public Movies with_western(Integer western) {
    this.western = western;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Movies)) {
      return false;
    }
    Movies that = (Movies) o;
    boolean equal = true;
    equal = equal && (this.movieid == null ? that.movieid == null : this.movieid.equals(that.movieid));
    equal = equal && (this.movie_name == null ? that.movie_name == null : this.movie_name.equals(that.movie_name));
    equal = equal && (this.release_date == null ? that.release_date == null : this.release_date.equals(that.release_date));
    equal = equal && (this.imdb_url == null ? that.imdb_url == null : this.imdb_url.equals(that.imdb_url));
    equal = equal && (this.unknown_genre == null ? that.unknown_genre == null : this.unknown_genre.equals(that.unknown_genre));
    equal = equal && (this.action == null ? that.action == null : this.action.equals(that.action));
    equal = equal && (this.adventure == null ? that.adventure == null : this.adventure.equals(that.adventure));
    equal = equal && (this.animation == null ? that.animation == null : this.animation.equals(that.animation));
    equal = equal && (this.children == null ? that.children == null : this.children.equals(that.children));
    equal = equal && (this.comedy == null ? that.comedy == null : this.comedy.equals(that.comedy));
    equal = equal && (this.crime == null ? that.crime == null : this.crime.equals(that.crime));
    equal = equal && (this.documentary == null ? that.documentary == null : this.documentary.equals(that.documentary));
    equal = equal && (this.drama == null ? that.drama == null : this.drama.equals(that.drama));
    equal = equal && (this.fantasy == null ? that.fantasy == null : this.fantasy.equals(that.fantasy));
    equal = equal && (this.film_noir == null ? that.film_noir == null : this.film_noir.equals(that.film_noir));
    equal = equal && (this.horror == null ? that.horror == null : this.horror.equals(that.horror));
    equal = equal && (this.musical == null ? that.musical == null : this.musical.equals(that.musical));
    equal = equal && (this.mystery == null ? that.mystery == null : this.mystery.equals(that.mystery));
    equal = equal && (this.romance == null ? that.romance == null : this.romance.equals(that.romance));
    equal = equal && (this.sci_fi == null ? that.sci_fi == null : this.sci_fi.equals(that.sci_fi));
    equal = equal && (this.thriller == null ? that.thriller == null : this.thriller.equals(that.thriller));
    equal = equal && (this.war == null ? that.war == null : this.war.equals(that.war));
    equal = equal && (this.western == null ? that.western == null : this.western.equals(that.western));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.movieid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.movie_name = JdbcWritableBridge.readString(2, __dbResults);
    this.release_date = JdbcWritableBridge.readString(3, __dbResults);
    this.imdb_url = JdbcWritableBridge.readString(4, __dbResults);
    this.unknown_genre = JdbcWritableBridge.readInteger(5, __dbResults);
    this.action = JdbcWritableBridge.readInteger(6, __dbResults);
    this.adventure = JdbcWritableBridge.readInteger(7, __dbResults);
    this.animation = JdbcWritableBridge.readInteger(8, __dbResults);
    this.children = JdbcWritableBridge.readInteger(9, __dbResults);
    this.comedy = JdbcWritableBridge.readInteger(10, __dbResults);
    this.crime = JdbcWritableBridge.readInteger(11, __dbResults);
    this.documentary = JdbcWritableBridge.readInteger(12, __dbResults);
    this.drama = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fantasy = JdbcWritableBridge.readInteger(14, __dbResults);
    this.film_noir = JdbcWritableBridge.readInteger(15, __dbResults);
    this.horror = JdbcWritableBridge.readInteger(16, __dbResults);
    this.musical = JdbcWritableBridge.readInteger(17, __dbResults);
    this.mystery = JdbcWritableBridge.readInteger(18, __dbResults);
    this.romance = JdbcWritableBridge.readInteger(19, __dbResults);
    this.sci_fi = JdbcWritableBridge.readInteger(20, __dbResults);
    this.thriller = JdbcWritableBridge.readInteger(21, __dbResults);
    this.war = JdbcWritableBridge.readInteger(22, __dbResults);
    this.western = JdbcWritableBridge.readInteger(23, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(movieid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(movie_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(release_date, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(imdb_url, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(unknown_genre, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(action, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(adventure, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(animation, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(children, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(comedy, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(crime, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(documentary, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(drama, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fantasy, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(film_noir, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(horror, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(musical, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(mystery, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(romance, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(sci_fi, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(thriller, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(war, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(western, 23 + __off, -6, __dbStmt);
    return 23;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.movieid = null;
    } else {
    this.movieid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.movie_name = null;
    } else {
    this.movie_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.release_date = null;
    } else {
    this.release_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.imdb_url = null;
    } else {
    this.imdb_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.unknown_genre = null;
    } else {
    this.unknown_genre = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.action = null;
    } else {
    this.action = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.adventure = null;
    } else {
    this.adventure = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.animation = null;
    } else {
    this.animation = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.children = null;
    } else {
    this.children = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.comedy = null;
    } else {
    this.comedy = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.crime = null;
    } else {
    this.crime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.documentary = null;
    } else {
    this.documentary = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.drama = null;
    } else {
    this.drama = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fantasy = null;
    } else {
    this.fantasy = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.film_noir = null;
    } else {
    this.film_noir = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.horror = null;
    } else {
    this.horror = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.musical = null;
    } else {
    this.musical = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.mystery = null;
    } else {
    this.mystery = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.romance = null;
    } else {
    this.romance = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.sci_fi = null;
    } else {
    this.sci_fi = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.thriller = null;
    } else {
    this.thriller = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.war = null;
    } else {
    this.war = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.western = null;
    } else {
    this.western = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.movieid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movieid);
    }
    if (null == this.movie_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, movie_name);
    }
    if (null == this.release_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, release_date);
    }
    if (null == this.imdb_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, imdb_url);
    }
    if (null == this.unknown_genre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.unknown_genre);
    }
    if (null == this.action) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.action);
    }
    if (null == this.adventure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.adventure);
    }
    if (null == this.animation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.animation);
    }
    if (null == this.children) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.children);
    }
    if (null == this.comedy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.comedy);
    }
    if (null == this.crime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.crime);
    }
    if (null == this.documentary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.documentary);
    }
    if (null == this.drama) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.drama);
    }
    if (null == this.fantasy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fantasy);
    }
    if (null == this.film_noir) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.film_noir);
    }
    if (null == this.horror) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.horror);
    }
    if (null == this.musical) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.musical);
    }
    if (null == this.mystery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mystery);
    }
    if (null == this.romance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.romance);
    }
    if (null == this.sci_fi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sci_fi);
    }
    if (null == this.thriller) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.thriller);
    }
    if (null == this.war) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.war);
    }
    if (null == this.western) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.western);
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(movieid==null?"null":"" + movieid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_name==null?"null":movie_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(release_date==null?"null":release_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(imdb_url==null?"null":imdb_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(unknown_genre==null?"null":"" + unknown_genre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(action==null?"null":"" + action, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(adventure==null?"null":"" + adventure, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(animation==null?"null":"" + animation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(children==null?"null":"" + children, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comedy==null?"null":"" + comedy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crime==null?"null":"" + crime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(documentary==null?"null":"" + documentary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(drama==null?"null":"" + drama, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fantasy==null?"null":"" + fantasy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(film_noir==null?"null":"" + film_noir, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(horror==null?"null":"" + horror, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(musical==null?"null":"" + musical, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mystery==null?"null":"" + mystery, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(romance==null?"null":"" + romance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sci_fi==null?"null":"" + sci_fi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thriller==null?"null":"" + thriller, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(war==null?"null":"" + war, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(western==null?"null":"" + western, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movieid = null; } else {
      this.movieid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.movie_name = null; } else {
      this.movie_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.release_date = null; } else {
      this.release_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.imdb_url = null; } else {
      this.imdb_url = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.unknown_genre = null; } else {
      this.unknown_genre = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.action = null; } else {
      this.action = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.adventure = null; } else {
      this.adventure = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.animation = null; } else {
      this.animation = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.children = null; } else {
      this.children = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.comedy = null; } else {
      this.comedy = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crime = null; } else {
      this.crime = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.documentary = null; } else {
      this.documentary = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.drama = null; } else {
      this.drama = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fantasy = null; } else {
      this.fantasy = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.film_noir = null; } else {
      this.film_noir = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.horror = null; } else {
      this.horror = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.musical = null; } else {
      this.musical = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mystery = null; } else {
      this.mystery = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.romance = null; } else {
      this.romance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sci_fi = null; } else {
      this.sci_fi = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.thriller = null; } else {
      this.thriller = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.war = null; } else {
      this.war = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.western = null; } else {
      this.western = Integer.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    Movies o = (Movies) super.clone();
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("movieid", this.movieid);
    __sqoop$field_map.put("movie_name", this.movie_name);
    __sqoop$field_map.put("release_date", this.release_date);
    __sqoop$field_map.put("imdb_url", this.imdb_url);
    __sqoop$field_map.put("unknown_genre", this.unknown_genre);
    __sqoop$field_map.put("action", this.action);
    __sqoop$field_map.put("adventure", this.adventure);
    __sqoop$field_map.put("animation", this.animation);
    __sqoop$field_map.put("children", this.children);
    __sqoop$field_map.put("comedy", this.comedy);
    __sqoop$field_map.put("crime", this.crime);
    __sqoop$field_map.put("documentary", this.documentary);
    __sqoop$field_map.put("drama", this.drama);
    __sqoop$field_map.put("fantasy", this.fantasy);
    __sqoop$field_map.put("film_noir", this.film_noir);
    __sqoop$field_map.put("horror", this.horror);
    __sqoop$field_map.put("musical", this.musical);
    __sqoop$field_map.put("mystery", this.mystery);
    __sqoop$field_map.put("romance", this.romance);
    __sqoop$field_map.put("sci_fi", this.sci_fi);
    __sqoop$field_map.put("thriller", this.thriller);
    __sqoop$field_map.put("war", this.war);
    __sqoop$field_map.put("western", this.western);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("movieid".equals(__fieldName)) {
      this.movieid = (Integer) __fieldVal;
    }
    else    if ("movie_name".equals(__fieldName)) {
      this.movie_name = (String) __fieldVal;
    }
    else    if ("release_date".equals(__fieldName)) {
      this.release_date = (String) __fieldVal;
    }
    else    if ("imdb_url".equals(__fieldName)) {
      this.imdb_url = (String) __fieldVal;
    }
    else    if ("unknown_genre".equals(__fieldName)) {
      this.unknown_genre = (Integer) __fieldVal;
    }
    else    if ("action".equals(__fieldName)) {
      this.action = (Integer) __fieldVal;
    }
    else    if ("adventure".equals(__fieldName)) {
      this.adventure = (Integer) __fieldVal;
    }
    else    if ("animation".equals(__fieldName)) {
      this.animation = (Integer) __fieldVal;
    }
    else    if ("children".equals(__fieldName)) {
      this.children = (Integer) __fieldVal;
    }
    else    if ("comedy".equals(__fieldName)) {
      this.comedy = (Integer) __fieldVal;
    }
    else    if ("crime".equals(__fieldName)) {
      this.crime = (Integer) __fieldVal;
    }
    else    if ("documentary".equals(__fieldName)) {
      this.documentary = (Integer) __fieldVal;
    }
    else    if ("drama".equals(__fieldName)) {
      this.drama = (Integer) __fieldVal;
    }
    else    if ("fantasy".equals(__fieldName)) {
      this.fantasy = (Integer) __fieldVal;
    }
    else    if ("film_noir".equals(__fieldName)) {
      this.film_noir = (Integer) __fieldVal;
    }
    else    if ("horror".equals(__fieldName)) {
      this.horror = (Integer) __fieldVal;
    }
    else    if ("musical".equals(__fieldName)) {
      this.musical = (Integer) __fieldVal;
    }
    else    if ("mystery".equals(__fieldName)) {
      this.mystery = (Integer) __fieldVal;
    }
    else    if ("romance".equals(__fieldName)) {
      this.romance = (Integer) __fieldVal;
    }
    else    if ("sci_fi".equals(__fieldName)) {
      this.sci_fi = (Integer) __fieldVal;
    }
    else    if ("thriller".equals(__fieldName)) {
      this.thriller = (Integer) __fieldVal;
    }
    else    if ("war".equals(__fieldName)) {
      this.war = (Integer) __fieldVal;
    }
    else    if ("western".equals(__fieldName)) {
      this.western = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
