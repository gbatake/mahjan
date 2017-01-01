package sample_java001;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController  implements Initializable {

	//試し中
	Menu menu = new Menu();
	ContextMenu context = new ContextMenu();
	MenuItem[] items = new MenuItem[2];
	ObservableList<String> options =
		    FXCollections.observableArrayList(
		        "Option 1",
		        "Option 2",
		        "Option 3"
		    );
	@FXML public ComboBox<ObservableList<String>> combo11 = new ComboBox<ObservableList<String>>();




	@FXML public ComboBox<ImageView> combo1 = new ComboBox<ImageView>();
	@FXML Button button1 = new Button();


	@FXML ImageView imv_hai1 = new ImageView();


	private String[] param = new String[100];
	Param pset = new Param();


	Image img1 = new Image("aka1-66-90-s-emb.png");
	Image img2 = new Image("aka2-66-90-s-emb.png");
	Image img3 = new Image("aka3-66-90-s-emb.png");
	Image img4 = new Image("ji1-66-90-s-emb.png");
	ImageView imgView1 = new ImageView();
	ImageView imgView2 = new ImageView();
	ImageView imgView3 = new ImageView();
	ImageView imgView4 = new ImageView();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		imgView1.setImage(img1);
		imgView2.setImage(img2);
		imgView3.setImage(img3);
		imgView4.setImage(img4);

		combo1.getItems().addAll(imgView1,imgView2,imgView3,imgView4);

		//試し中
		items[0] = new MenuItem("メニュー1");
		items[1] = new MenuItem("メニュー2");
		context.getItems().addAll(items);
		combo11.getItems().add(options);
		combo11.setContextMenu(context);

//		button1.


	}

	@FXML
	public void combo1_onMouseClicked(){
		combo1.getItems().clear();
		combo1.getItems().addAll(imgView1,imgView2,imgView3,imgView4);
	}

	@FXML
	public void button1_OnMouseCliceked(){
		try {
			// 新しいウインドウを生成
			Stage newStage = new Stage();
			// モーダルウインドウに設定
			newStage.initModality(Modality.APPLICATION_MODAL);
			// オーナーを設定
			newStage.initOwner(null);
			// 新しいウインドウ内に配置するコンテンツを生成
			BorderPane root = (BorderPane) FXMLLoader
					.load(getClass().getResource("Select.fxml"));
			Scene scene = new Scene(root, 800, 500);
			scene.getStylesheets()
					.add(getClass().getResource("select.css").toExternalForm());
			newStage.setScene(scene);
			// 新しいウインドウを表示
			newStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
		}


		param = pset.getParam();
		String imFileName = param[0];

		Image im_man1 = new Image("image/"+imFileName);

		imv_hai1.setImage(im_man1);





	}


}
