package sample_java001;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController  implements Initializable {


	//ボタン
	@FXML Button button_hai1 = new Button();
	@FXML Button button_hai2 = new Button();
	@FXML Button button_hai3 = new Button();
	@FXML Button button_hai4 = new Button();
	@FXML Button button_hai5 = new Button();
	@FXML Button button_hai6 = new Button();
	@FXML Button button_hai7 = new Button();
	@FXML Button button_hai8 = new Button();
	@FXML Button button_hai9 = new Button();
	@FXML Button button_hai10 = new Button();
	@FXML Button button_hai11 = new Button();
	@FXML Button button_hai12 = new Button();
	@FXML Button button_hai13 = new Button();
	@FXML Button button_hai14 = new Button();
	@FXML Button button_dora = new Button();
	@FXML Button button_uradora = new Button();

	@FXML Button button_pon1 = new Button();
	@FXML Button button_tii1 = new Button();
	@FXML Button button_akan1 = new Button();
	@FXML Button button_mkan1 = new Button();
	@FXML Button button_pon2 = new Button();
	@FXML Button button_tii2 = new Button();
	@FXML Button button_akan2 = new Button();
	@FXML Button button_mkan2 = new Button();
	@FXML Button button_pon3 = new Button();
	@FXML Button button_tii3 = new Button();
	@FXML Button button_akan3 = new Button();
	@FXML Button button_mkan3 = new Button();
	@FXML Button button_pon4 = new Button();
	@FXML Button button_tii4 = new Button();
	@FXML Button button_akan4 = new Button();
	@FXML Button button_mkan4 = new Button();

	@FXML Button button_calc = new Button();

	//ボタン画像
	@FXML ImageView imv_hai1 = new ImageView();
	@FXML ImageView imv_hai2 = new ImageView();
	@FXML ImageView imv_hai3 = new ImageView();
	@FXML ImageView imv_hai4 = new ImageView();
	@FXML ImageView imv_hai5 = new ImageView();
	@FXML ImageView imv_hai6 = new ImageView();
	@FXML ImageView imv_hai7 = new ImageView();
	@FXML ImageView imv_hai8 = new ImageView();
	@FXML ImageView imv_hai9 = new ImageView();
	@FXML ImageView imv_hai10 = new ImageView();
	@FXML ImageView imv_hai11 = new ImageView();
	@FXML ImageView imv_hai12 = new ImageView();
	@FXML ImageView imv_hai13 = new ImageView();
	@FXML ImageView imv_hai14 = new ImageView();
	@FXML ImageView imv_dora = new ImageView();
	@FXML ImageView imv_uradora = new ImageView();

	//コンボボックス
	@FXML ComboBox<String> combo_fwind = new ComboBox<String>();
	@FXML ComboBox<String> combo_wind = new ComboBox<String>();
	@FXML ComboBox<String> combo_PorC = new ComboBox<String>();
	@FXML ComboBox<String> combo_mati = new ComboBox<String>();
	@FXML ComboBox<String> combo_agari = new ComboBox<String>();

	//チェックボックス
	@FXML CheckBox checkbox_reach = new CheckBox();
	@FXML CheckBox checkbox_one = new CheckBox();

	//サブ画面用パラメータ
	private String[] param = new String[100];
	Param pset = new Param();

	//ボタンフラグ　ポン・カン・チー
	Boolean flg_pon1 = false;
	Boolean flg_tii1 = false;
	Boolean flg_akan1 = false;
	Boolean flg_mkan1 = false;
	Boolean flg_pon2 = false;
	Boolean flg_tii2 = false;
	Boolean flg_akan2 = false;
	Boolean flg_mkan2 = false;
	Boolean flg_pon3 = false;
	Boolean flg_tii3 = false;
	Boolean flg_akan3 = false;
	Boolean flg_mkan3 = false;
	Boolean flg_pon4 = false;
	Boolean flg_tii4 = false;
	Boolean flg_akan4 = false;
	Boolean flg_mkan4 = false;

	Hai hai1 = new Hai();
	Hai hai2 = new Hai();
	Hai hai3 = new Hai();
	Hai hai4 = new Hai();
	Hai hai5 = new Hai();
	Hai hai6 = new Hai();
	Hai hai7 = new Hai();
	Hai hai8 = new Hai();
	Hai hai9 = new Hai();
	Hai hai10 = new Hai();
	Hai hai11 = new Hai();
	Hai hai12 = new Hai();
	Hai hai13 = new Hai();
	Hai hai14 = new Hai();
	Hai hai_dora = new Hai();
	Hai hai_uradora = new Hai();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//コンボボックス　親・子
		String oya = "親";
		String child = "子";
		combo_PorC.getItems().addAll(oya,child);

		//コンボボックス　場風・自風
		String ton = "東";
		String nan = "南";
		String sha = "西";
		String pei = "北";
		combo_fwind.getItems().addAll(ton,nan,sha,pei);
		combo_wind.getItems().addAll(ton,nan,sha,pei);


		//コンボボックス　待ち
		String ryanmen = "リャンメン";
		String shabo = "シャボ";
		String penchan = "ペンチャン";
		String kanchan = "カンチャン";
		String tanki = "タンキ";
		String nobetan = "ノベタン";
		combo_mati.getItems().addAll(ryanmen,shabo,penchan,kanchan,tanki,nobetan);

		//コンボボックス　和了
		String ron = "ロン";
		String tumo = "ツモ";
		combo_agari.getItems().addAll(ron,tumo);

		button_pon1.getStyleClass().clear();
		button_pon1.getStyleClass().addAll("button","buttondefault");

		button_tii1.getStyleClass().clear();
		button_tii1.getStyleClass().addAll("button","buttondefault");

		button_akan1.getStyleClass().clear();
		button_akan1.getStyleClass().addAll("button","buttondefault");

		button_mkan1.getStyleClass().clear();
		button_mkan1.getStyleClass().addAll("button","buttondefault");

		button_pon2.getStyleClass().clear();
		button_pon2.getStyleClass().addAll("button","buttondefault");

		button_tii2.getStyleClass().clear();
		button_tii2.getStyleClass().addAll("button","buttondefault");

		button_akan2.getStyleClass().clear();
		button_akan2.getStyleClass().addAll("button","buttondefault");

		button_mkan2.getStyleClass().clear();
		button_mkan2.getStyleClass().addAll("button","buttondefault");

		button_pon3.getStyleClass().clear();
		button_pon3.getStyleClass().addAll("button","buttondefault");

		button_tii3.getStyleClass().clear();
		button_tii3.getStyleClass().addAll("button","buttondefault");

		button_akan3.getStyleClass().clear();
		button_akan3.getStyleClass().addAll("button","buttondefault");

		button_mkan3.getStyleClass().clear();
		button_mkan3.getStyleClass().addAll("button","buttondefault");

		button_pon4.getStyleClass().clear();
		button_pon4.getStyleClass().addAll("button","buttondefault");

		button_tii4.getStyleClass().clear();
		button_tii4.getStyleClass().addAll("button","buttondefault");

		button_akan4.getStyleClass().clear();
		button_akan4.getStyleClass().addAll("button","buttondefault");

		button_mkan4.getStyleClass().clear();
		button_mkan4.getStyleClass().addAll("button","buttondefault");

	}

	@FXML
	public void button_hai1_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai1.selectHai(button_hai1, imv_hai1, haiId, imFileName);
	}

	@FXML
	public void button_hai2_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai2.selectHai(button_hai2, imv_hai2, haiId, imFileName);
	}

	@FXML
	public void button_hai3_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai3.selectHai(button_hai3, imv_hai3, haiId, imFileName);

	}

	@FXML
	public void button_hai4_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai4.selectHai(button_hai4, imv_hai4, haiId, imFileName);
	}

	@FXML
	public void button_hai5_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai5.selectHai(button_hai5, imv_hai5, haiId, imFileName);
	}

	@FXML
	public void button_hai6_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai6.selectHai(button_hai6, imv_hai6, haiId, imFileName);
	}

	@FXML
	public void button_hai7_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai7.selectHai(button_hai7, imv_hai7, haiId, imFileName);
	}

	@FXML
	public void button_hai8_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai8.selectHai(button_hai8, imv_hai8, haiId, imFileName);
	}

	@FXML
	public void button_hai9_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai9.selectHai(button_hai9, imv_hai9, haiId, imFileName);
	}

	@FXML
	public void button_hai10_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai10.selectHai(button_hai10, imv_hai10, haiId, imFileName);
	}

	@FXML
	public void button_hai11_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai11.selectHai(button_hai11, imv_hai11, haiId, imFileName);
	}

	@FXML
	public void button_hai12_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai12.selectHai(button_hai12, imv_hai12, haiId, imFileName);
	}

	@FXML
	public void button_hai13_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai13.selectHai(button_hai13, imv_hai13, haiId, imFileName);
	}

	@FXML
	public void button_hai14_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai14.selectHai(button_hai14, imv_hai14, haiId, imFileName);
	}

	@FXML
	public void button_dora_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai_dora.selectHai(button_dora, imv_dora, haiId, imFileName);
	}

	@FXML
	public void button_uradora_OnMouseCliceked(){

		//サブ画面起動
		select_start();

		//サブ画面パラメータ受け取り
		param = pset.getParam();
		String imFileName = param[0];
		String haiId = param[1];

		//選択牌を設定
		hai_uradora.selectHai(button_uradora, imv_uradora, haiId, imFileName);
	}

	@FXML
	public void button_pon1_OnMouseCliceked(){

		if(flg_pon1 == false){
			//押下状態
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttondefault");
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttondefault");
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = true;
			flg_tii1 = false;
			flg_akan1 = false;
			flg_mkan1 = false;

		}else{
			//押下状態解除
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = false;
		}
	}

	@FXML
	public void button_tii1_OnMouseCliceked(){

		if(flg_tii1 == false){
			//押下状態
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttondefault");
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttondefault");
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = false;
			flg_tii1 = true;
			flg_akan1 = false;
			flg_mkan1 = false;

		}else{
			//押下状態解除
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttondefault");

			flg_tii1 = false;
		}
	}

	@FXML
	public void button_akan1_OnMouseCliceked(){

		if(flg_akan1 == false){
			//押下状態
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttondefault");
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttondefault");
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = false;
			flg_tii1 = false;
			flg_akan1 = true;
			flg_mkan1 = false;

		}else{
			//押下状態解除
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttondefault");

			flg_akan1 = false;
		}

	}

	@FXML
	public void button_mkan1_OnMouseCliceked(){

		if(flg_mkan1 == false){
			//押下状態
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon1.getStyleClass().clear();
			button_pon1.getStyleClass().addAll("button","buttondefault");
			button_tii1.getStyleClass().clear();
			button_tii1.getStyleClass().addAll("button","buttondefault");
			button_akan1.getStyleClass().clear();
			button_akan1.getStyleClass().addAll("button","buttondefault");

			flg_pon1 = false;
			flg_tii1 = false;
			flg_akan1 = false;
			flg_mkan1 = true;

		}else{
			//押下状態解除
			button_mkan1.getStyleClass().clear();
			button_mkan1.getStyleClass().addAll("button","buttondefault");

			flg_mkan1 = false;
		}

	}

	@FXML
	public void button_pon2_OnMouseCliceked(){

		if(flg_pon2 == false){
			//押下状態
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttondefault");
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttondefault");
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = true;
			flg_tii2 = false;
			flg_akan2 = false;
			flg_mkan2 = false;

		}else{
			//押下状態解除
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = false;
		}
	}

	@FXML
	public void button_tii2_OnMouseCliceked(){

		if(flg_tii2 == false){
			//押下状態
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttondefault");
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttondefault");
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = false;
			flg_tii2 = true;
			flg_akan2 = false;
			flg_mkan2 = false;

		}else{
			//押下状態解除
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttondefault");

			flg_tii2 = false;
		}
	}

	@FXML
	public void button_akan2_OnMouseCliceked(){

		if(flg_akan2 == false){
			//押下状態
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttondefault");
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttondefault");
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = false;
			flg_tii2 = false;
			flg_akan2 = true;
			flg_mkan2 = false;

		}else{
			//押下状態解除
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttondefault");

			flg_akan2 = false;
		}

	}

	@FXML
	public void button_mkan2_OnMouseCliceked(){

		if(flg_mkan2 == false){
			//押下状態
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon2.getStyleClass().clear();
			button_pon2.getStyleClass().addAll("button","buttondefault");
			button_tii2.getStyleClass().clear();
			button_tii2.getStyleClass().addAll("button","buttondefault");
			button_akan2.getStyleClass().clear();
			button_akan2.getStyleClass().addAll("button","buttondefault");

			flg_pon2 = false;
			flg_tii2 = false;
			flg_akan2 = false;
			flg_mkan2 = true;

		}else{
			//押下状態解除
			button_mkan2.getStyleClass().clear();
			button_mkan2.getStyleClass().addAll("button","buttondefault");

			flg_mkan2 = false;
		}

	}

	@FXML
	public void button_pon3_OnMouseCliceked(){

		if(flg_pon3 == false){
			//押下状態
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttondefault");
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttondefault");
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = true;
			flg_tii3 = false;
			flg_akan3 = false;
			flg_mkan3 = false;

		}else{
			//押下状態解除
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = false;
		}
	}

	@FXML
	public void button_tii3_OnMouseCliceked(){

		if(flg_tii3 == false){
			//押下状態
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttondefault");
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttondefault");
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = false;
			flg_tii3 = true;
			flg_akan3 = false;
			flg_mkan3 = false;

		}else{
			//押下状態解除
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttondefault");

			flg_tii3 = false;
		}
	}

	@FXML
	public void button_akan3_OnMouseCliceked(){

		if(flg_akan3 == false){
			//押下状態
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttondefault");
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttondefault");
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = false;
			flg_tii3 = false;
			flg_akan3 = true;
			flg_mkan3 = false;

		}else{
			//押下状態解除
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttondefault");

			flg_akan3 = false;
		}

	}

	@FXML
	public void button_mkan3_OnMouseCliceked(){

		if(flg_mkan3 == false){
			//押下状態
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon3.getStyleClass().clear();
			button_pon3.getStyleClass().addAll("button","buttondefault");
			button_tii3.getStyleClass().clear();
			button_tii3.getStyleClass().addAll("button","buttondefault");
			button_akan3.getStyleClass().clear();
			button_akan3.getStyleClass().addAll("button","buttondefault");

			flg_pon3 = false;
			flg_tii3 = false;
			flg_akan3 = false;
			flg_mkan3 = true;

		}else{
			//押下状態解除
			button_mkan3.getStyleClass().clear();
			button_mkan3.getStyleClass().addAll("button","buttondefault");

			flg_mkan3 = false;
		}

	}

	@FXML
	public void button_pon4_OnMouseCliceked(){

		if(flg_pon4 == false){
			//押下状態
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttondefault");
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttondefault");
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = true;
			flg_tii4 = false;
			flg_akan4 = false;
			flg_mkan4 = false;

		}else{
			//押下状態解除
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = false;
		}
	}

	@FXML
	public void button_tii4_OnMouseCliceked(){

		if(flg_tii4 == false){
			//押下状態
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttondefault");
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttondefault");
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = false;
			flg_tii4 = true;
			flg_akan4 = false;
			flg_mkan4 = false;

		}else{
			//押下状態解除
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttondefault");

			flg_tii4 = false;
		}
	}

	@FXML
	public void button_akan4_OnMouseCliceked(){

		if(flg_akan4 == false){
			//押下状態
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttondefault");
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttondefault");
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = false;
			flg_tii4 = false;
			flg_akan4 = true;
			flg_mkan4 = false;

		}else{
			//押下状態解除
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttondefault");

			flg_akan4 = false;
		}

	}

	@FXML
	public void button_mkan4_OnMouseCliceked(){

		if(flg_mkan4 == false){
			//押下状態
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttonpush");

			//押下状態解除
			button_pon4.getStyleClass().clear();
			button_pon4.getStyleClass().addAll("button","buttondefault");
			button_tii4.getStyleClass().clear();
			button_tii4.getStyleClass().addAll("button","buttondefault");
			button_akan4.getStyleClass().clear();
			button_akan4.getStyleClass().addAll("button","buttondefault");

			flg_pon4 = false;
			flg_tii4 = false;
			flg_akan4 = false;
			flg_mkan4 = true;

		}else{
			//押下状態解除
			button_mkan4.getStyleClass().clear();
			button_mkan4.getStyleClass().addAll("button","buttondefault");

			flg_mkan4 = false;
		}

	}

	@FXML
	public void button_calc_OnMouseCliceked(){
		System.out.println("calc");
		TeHai tehai = new TeHai();

		//値をセット
		tehai.setPorc(combo_PorC.getValue());
		tehai.setWind(combo_wind.getValue());
		tehai.setDora(hai_dora.getSelectHaiId());
		tehai.setUradora(hai_uradora.getSelectHaiId());
		tehai.setReach(checkbox_reach.isSelected());
		tehai.setOne(checkbox_one.isSelected());
		tehai.setAgari(combo_agari.getValue());

		if(flg_pon1 == true){
			tehai.getMentsu1().setNaki("ポン");
		}else if(flg_tii1 == true){
			tehai.getMentsu1().setNaki("チー");
		}else if(flg_akan1 == true){
			tehai.getMentsu1().setNaki("暗カン");
		}else if(flg_mkan1 == true){
			tehai.getMentsu1().setNaki("明カン");
		}else{
			tehai.getMentsu1().setNaki("無");
		}

		tehai.getMentsu1().setHai1(hai1.getSelectHaiId());
		tehai.getMentsu1().setHai2(hai2.getSelectHaiId());
		tehai.getMentsu1().setHai3(hai3.getSelectHaiId());

		if(flg_pon2 == true){
			tehai.getMentsu2().setNaki("ポン");
		}else if(flg_tii2 == true){
			tehai.getMentsu2().setNaki("チー");
		}else if(flg_akan2 == true){
			tehai.getMentsu2().setNaki("暗カン");
		}else if(flg_mkan2 == true){
			tehai.getMentsu2().setNaki("明カン");
		}else{
			tehai.getMentsu2().setNaki("無");
		}

		tehai.getMentsu2().setHai1(hai4.getSelectHaiId());
		tehai.getMentsu2().setHai2(hai5.getSelectHaiId());
		tehai.getMentsu2().setHai3(hai6.getSelectHaiId());

		if(flg_pon3 == true){
			tehai.getMentsu3().setNaki("ポン");
		}else if(flg_tii3 == true){
			tehai.getMentsu3().setNaki("チー");
		}else if(flg_akan3 == true){
			tehai.getMentsu3().setNaki("暗カン");
		}else if(flg_mkan3 == true){
			tehai.getMentsu3().setNaki("明カン");
		}else{
			tehai.getMentsu3().setNaki("無");
		}

		tehai.getMentsu3().setHai1(hai7.getSelectHaiId());
		tehai.getMentsu3().setHai2(hai8.getSelectHaiId());
		tehai.getMentsu3().setHai3(hai9.getSelectHaiId());

		if(flg_pon4 == true){
			tehai.getMentsu4().setNaki("ポン");
		}else if(flg_tii4 == true){
			tehai.getMentsu4().setNaki("チー");
		}else if(flg_akan4 == true){
			tehai.getMentsu4().setNaki("暗カン");
		}else if(flg_mkan4 == true){
			tehai.getMentsu4().setNaki("明カン");
		}else{
			tehai.getMentsu4().setNaki("無");
		}

		tehai.getMentsu4().setHai1(hai10.getSelectHaiId());
		tehai.getMentsu4().setHai2(hai11.getSelectHaiId());
		tehai.getMentsu4().setHai3(hai12.getSelectHaiId());

		tehai.setAtama1(hai13.getSelectHaiId());
		tehai.setAtama1(hai14.getSelectHaiId());

		//デバッグログ
		System.out.println(tehai.getPorc());
		System.out.println(tehai.getWind());
		System.out.println(tehai.getDora());
		System.out.println(tehai.getUradora());
		System.out.println(tehai.getReach());
		System.out.println(tehai.getOne());
		System.out.println(tehai.getAgari());
		System.out.println(tehai.getMentsu1().getNaki());
		System.out.println(tehai.getMentsu1().getHai1());
		System.out.println(tehai.getMentsu1().getHai2());
		System.out.println(tehai.getMentsu1().getHai3());
		System.out.println(tehai.getMentsu2().getNaki());
		System.out.println(tehai.getMentsu2().getHai1());
		System.out.println(tehai.getMentsu2().getHai2());
		System.out.println(tehai.getMentsu2().getHai3());
		System.out.println(tehai.getMentsu3().getNaki());
		System.out.println(tehai.getMentsu3().getHai1());
		System.out.println(tehai.getMentsu3().getHai2());
		System.out.println(tehai.getMentsu3().getHai3());
		System.out.println(tehai.getMentsu4().getNaki());
		System.out.println(tehai.getMentsu4().getHai1());
		System.out.println(tehai.getMentsu4().getHai2());
		System.out.println(tehai.getMentsu4().getHai3());
		System.out.println(tehai.getAtama1());
		System.out.println(tehai.getAtama1());

		/*-------------------*/
		/*符計算             */
		/*-------------------*/
		int hu_hutei=0;
		int hu_agari=0;
		int hu_mentsu=0;
		int hu_mentsu1=0;
		int hu_mentsu2=0;
		int hu_mentsu3=0;
		int hu_mentsu4=0;

		//副底（フーテイ）＝基本符
		hu_hutei = 20;

		//門前加符（メンゼンカフ）と ツモ符（ツモフ）
		/*メンゼンロンの場合*/
		if(
				tehai.getAgari()=="ロン" &&
				flg_pon1==false &&
				flg_tii1==false &&
				flg_mkan1==false &&
				flg_pon2==false &&
				flg_tii2==false &&
				flg_mkan2==false &&
				flg_pon3==false &&
				flg_tii3==false &&
				flg_mkan3==false &&
				flg_pon4==false &&
				flg_tii4==false &&
				flg_mkan4==false
				){
			hu_agari = 10;
		}

		/*ツモの場合（ピンフの場合なし_未実装）*/
		else if(tehai.getAgari()=="ツモ"){
			hu_agari = 2;
		}

		//各面子（メンツ）の種類による 加符点
		//メンツ１
		/*順子(シュンツ)の場合*/
		if(	tehai.getMentsu1().getHai1() != tehai.getMentsu1().getHai2()){
			hu_mentsu1=0;
		}else{
			hu_mentsu1 = calc_Mentsu(tehai.getMentsu1());
		}

		//メンツ２
		/*順子(シュンツ)の場合*/
		if(	tehai.getMentsu2().getHai1() != tehai.getMentsu2().getHai2()){
			hu_mentsu2=0;
		}else{
			hu_mentsu2 = calc_Mentsu(tehai.getMentsu2());
		}

		//メンツ３
		/*順子(シュンツ)の場合*/
		if(	tehai.getMentsu3().getHai1() != tehai.getMentsu3().getHai2()){
			hu_mentsu3=0;
		}else{
			hu_mentsu3 = calc_Mentsu(tehai.getMentsu3());
		}

		//メンツ４
		/*順子(シュンツ)の場合*/
		if(	tehai.getMentsu4().getHai1() != tehai.getMentsu4().getHai2()){
			hu_mentsu4=0;
		}else{
			hu_mentsu4 = calc_Mentsu(tehai.getMentsu4());
		}

		hu_mentsu = hu_mentsu1 + hu_mentsu2 + hu_mentsu3 + hu_mentsu4;
System.out.println(hu_mentsu1);
System.out.println(hu_mentsu2);
System.out.println(hu_mentsu3);
System.out.println(hu_mentsu4);
System.out.println(hu_mentsu);










	}

	private void select_start(){
		try {
			// 新しいウインドウを生成
			Stage newStage = new Stage();
			//ツールバーなし
			newStage.initStyle(StageStyle.UNDECORATED);
			// モーダルウインドウに設定
			newStage.initModality(Modality.APPLICATION_MODAL);
			// オーナーを設定
			newStage.initOwner(null);
			// 新しいウインドウ内に配置するコンテンツを生成
			BorderPane root = (BorderPane) FXMLLoader
					.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(root, 650, 450);
			scene.getStylesheets()
					.add(getClass().getResource("select.css").toExternalForm());
			newStage.setScene(scene);
			// 新しいウインドウを表示
			newStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	private int calc_Mentsu(Mentsu mentsu){

		int hu = 0;

		String flg = mentsu.getHai1().substring(3);
		if(
				flg.equals("2") ||
				flg.equals("3") ||
				flg.equals("4") ||
				flg.equals("5") ||
				flg.equals("6") ||
				flg.equals("7") ||
				flg.equals("8")
				){

			/*2～8　明刻(ミンコ)の場合*/
			if(mentsu.getNaki() == "ポン"){
				hu=2;
			}

			/*2～8　暗刻(アンコ)の場合*/
			else if(mentsu.getNaki() == "無" &&
					mentsu.getHai1() == mentsu.getHai2()){
				hu=4;
			}

			/*2～8　明槓(ミンカン)の場合*/
			else if(mentsu.getNaki() == "明カン" &&
					mentsu.getHai1() == mentsu.getHai2()){
				hu=8;
			}

			/*2～8　暗槓(アンカン)の場合*/
			else if(mentsu.getNaki() == "暗カン" &&
					mentsu.getHai1() == mentsu.getHai2()){
				hu=16;
			}

		}else{
			/*1・9・字牌　明刻(ミンコ)の場合*/
			if(mentsu.getNaki() == "ポン"){
				hu=4;
			}

			/*1・9・字牌　暗刻(アンコ)の場合*/
			else if(mentsu.getNaki() == "無" &&
					mentsu.getHai1() == mentsu.getHai2()){
				hu=8;
			}

			/*1・9・字牌　明槓(ミンカン)の場合*/
			else if(mentsu.getNaki() == "明カン" &&
					mentsu.getHai1() == mentsu.getHai2()){
				hu=16;
			}

			/*1・9・字牌　暗槓(アンカン)の場合*/
			else if(mentsu.getNaki() == "暗カン" &&
					mentsu.getHai1() == mentsu.getHai2()){
				hu=32;
			}
		}

		return hu;

	}


}
