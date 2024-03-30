package otsu4.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "otu4_question")
public class Otsu4Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "qurstion_nbr")
	// 問題番号
	private Integer qurstionNbr;
	
	@Column(name = "subject_id")
	//試験科目ID
	private Integer subjectId;
	
	@Column(name = "question_str")
	// 問題文
	private String questionStr;
	
	@Column(name = "choose_1_str")
	// 選択肢1
	private String choose1Str;
	
	@Column(name = "choose_2_str")
	// 選択肢2
	private String choose2Str;
	
	@Column(name = "choose_3_str")
	// 選択肢3
	private String choose3Str;
	
	@Column(name = "choose_4_str")
	// 選択肢4
	private String choose4Str;
	
	@Column(name = "choose_5_str")
	// 選択肢5
	private String choose5Str;
	
	@Column(name = "ans_nbr")
	// 正解番号
	private Integer ansNbr;
	
	@Column(name = "ans_str")
	// 解説文
	private String ansStr;
}
