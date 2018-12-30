package hell_555;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// 計算機（シンプル）
public class hell_555 extends Application {
	/*
	 *  フィールド変数
	 */
	// 主にインスタンスを初期化しておく（前準備）
	GridPane gridPane = null;
	String[] buttonNameNumeric = null;
	Button buttonPlus = null;
	Button buttonMinus = null;
	Button buttonTimes = null;
	Button buttonDivide = null;
	Button buttonNumeric_0 = null;
	Button buttonNumeric_1 = null;
	Button buttonNumeric_2 = null;
	Button buttonNumeric_3 = null;
	Button buttonNumeric_4 = null;
	Button buttonNumeric_5 = null;
	Button buttonNumeric_6 = null;
	Button buttonNumeric_7 = null;
	Button buttonNumeric_8 = null;
	Button buttonNumeric_9 = null;
	// 最上段のHBox
	HBox hbox1 = null;
	// ２段目のHBox
	HBox hbox2 = null;
	// ３段目のHBox
	HBox hbox3 = null;
	// ４段目のHBox
	HBox hbox4 = null;
	// 数値と四則演算をつなぐVBOX
	HBox hboxConnect = null;
	// 数値をまとめるVBOX(左部)
	VBox vboxNumeric = null;
	// 四則演算をまとめるVBOX（右部)
	VBox vboxManipulate = null;
	// 計算結果を表示するTextField（入力可）
	TextField ResultTextField = null;

	/*
	 *  コンストラクタ
	 */
	// インスタンスを生成しておく（切り分け）
	public hell_555() {
		gridPane = new GridPane();
		buttonPlus = new Button();
		buttonMinus = new Button();
		buttonTimes = new Button();
		buttonDivide = new Button();
		hbox1 = new HBox();
		hbox2 = new HBox();
		hbox3 = new HBox();
		hbox4 = new HBox();
		hboxConnect = new HBox();
		vboxNumeric = new VBox();
		vboxManipulate = new VBox();
		ResultTextField = new TextField();

		/**
		 *  ここから初期値の設定処理
		 */
		// GridPaneのスペーシングをする関数
		setPaneSpacing();
		// ０～９のボタンを設定する関数(まとめ)
		setButtonsNumeric();
		// 四則演算（ +, -, *, / ）のボタンを設定する関数（まとめ）
		setButtonsManipulate();
		// 各ボタンをまとめてつなぐ関数
		setConnectButtons();

	}

	/*
	 * javaFXのメイン関数に相当
	 */
	// javaFXのメイン関数に相当
	// 必要に応じてここでインスタンスを生成する
	public void start(Stage stage) {
		// Stageにタイトルを設定
		stage.setTitle("計算機（シンプル）");
		// GridPaneにボタンを設定
		gridPane.getChildren().add(hboxConnect);
		// SceneにGridPaneを設定
		Scene scene = new Scene(gridPane, 360, 360);
		// StageにSceneを設定
		stage.setScene(scene);
		// Stageを表示
		stage.show();
	}

	/*
	 *  ０～９のボタンを設定する関数(まとめ)
	 */
	// 関連するprivate関数のまとめ
	private void setButtonsNumeric() {
		/*
		 * 上から順番にインスタンスを設定
		 */
		// (インスタンスを設定する順番を違えると狂う)
		// ０～９のボタンを設定する関数１
		setNumButtonInstance();
		// ０～９のボタンを設定する関数２
		setButtonNumeric();
		// ０～９のボタンを設定する関数３
		setNumButtonPosition();
	}

	/*
	 *  ０～９のボタンを設定する関数１
	 *  ボタンインスタンスを設定
	 *  @param 関数にて生成したボタン名
	 */
	// private
	private void setNumButtonInstance() {
		buttonNumeric_0 = new Button();
		buttonNumeric_1 = new Button();
		buttonNumeric_2 = new Button();
		buttonNumeric_3 = new Button();
		buttonNumeric_4 = new Button();
		buttonNumeric_5 = new Button();
		buttonNumeric_6 = new Button();
		buttonNumeric_7 = new Button();
		buttonNumeric_8 = new Button();
		buttonNumeric_9 = new Button();
	}

	/*
	 *  ０～９のボタンを設定する関数２
	 *  ボタンテキストを設定
	 */
	// private
	private void setButtonNumeric() {
		buttonNumeric_0.setText("０");
		buttonNumeric_1.setText("１");
		buttonNumeric_2.setText("２");
		buttonNumeric_3.setText("３");
		buttonNumeric_4.setText("４");
		buttonNumeric_5.setText("５");
		buttonNumeric_6.setText("６");
		buttonNumeric_7.setText("７");
		buttonNumeric_8.setText("８");
		buttonNumeric_9.setText("９");
	}

	/*
	 *  ０～９のボタンを設定する関数３
	 *  ボタン配置を設定
	 */
	// private
	private void setNumButtonPosition() {
		buttonNumeric_0.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_1.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_2.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_3.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_4.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_5.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_6.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_7.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_8.setPadding(new Insets(15, 15, 15, 15));
		buttonNumeric_9.setPadding(new Insets(15, 15, 15, 15));
		ResultTextField.setPrefWidth(240);
		HBox.setMargin(buttonNumeric_0, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_1, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_2, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_3, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_4, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_5, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_6, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_7, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_8, new Insets(10, 10, 10, 10));
		HBox.setMargin(buttonNumeric_9, new Insets(10, 10, 10, 10));
		HBox.setMargin(ResultTextField, new Insets(20, 20, 20, 20));
		hbox1.getChildren().addAll(
				buttonNumeric_0, buttonNumeric_1, buttonNumeric_2);
		hbox2.getChildren().addAll(
				buttonNumeric_3, buttonNumeric_4, buttonNumeric_5);
		hbox3.getChildren().addAll(
				buttonNumeric_6, buttonNumeric_7, buttonNumeric_8);
		hbox4.getChildren().add(buttonNumeric_9);
		vboxNumeric.getChildren().addAll(hbox1, hbox2, hbox3, hbox4, ResultTextField);
	}

	/*
	 *  四則演算（ +, -, *, / ）のボタンを設定する関数(まとめ)
	 */
	// 関連するprivate関数のまとめ
	private void setButtonsManipulate() {
		/*
		 * 上から順番にインスタンスを設定
		 */
		// (インスタンスを設定する順番を違えると狂う)
		// 四則演算（ +, -, *, / ）のボタンを設定する関数１
		setButtonManipulate();
		// 四則演算（ +, -, *, / ）のボタンを設定する関数２
		setManipulaButtonPosition();
	}

	/*
	 *  四則演算（ +, -, *, / ）のボタンを設定する関数１
	 *  ボタンテキストを設定
	 */
	// private
	private void setButtonManipulate() {
		buttonPlus.setPadding(new Insets(20, 20, 20, 20));
		buttonMinus.setPadding(new Insets(20, 20, 20, 20));
		buttonTimes.setPadding(new Insets(20, 20, 20, 20));
		buttonDivide.setPadding(new Insets(20, 20, 20, 20));
		ResultTextField.setPadding(new Insets(20, 20, 20, 20));
		buttonPlus.setText("＋");
		buttonMinus.setText("ー");
		buttonTimes.setText("✕");
		buttonDivide.setText("➗");
	}

	/*
	 *  四則演算（ +, -, *, / ）のボタンを設定する関数２
	 *  ボタン配置を設定
	 */
	// private
	private void setManipulaButtonPosition() {
		VBox.setMargin(buttonPlus, new Insets(5, 5, 5, 5));
		VBox.setMargin(buttonMinus, new Insets(5, 5, 5, 5));
		VBox.setMargin(buttonTimes, new Insets(5, 5, 5, 5));
		VBox.setMargin(buttonDivide, new Insets(5, 5, 5, 5));
		vboxManipulate.getChildren().addAll(
				buttonPlus, buttonMinus, buttonTimes, buttonDivide);
	}

	/*
	 * 各ボタンをまとめてつなぐ関数
	 * （可読性のために敢えて関数にした）
	 */
	// private
	private void setConnectButtons() {
		hboxConnect.getChildren().addAll(
				vboxNumeric, vboxManipulate);
	}

	/*
	 * GridPaneのスペーシングをする関数
	 */
	// private
	private void setPaneSpacing() {
		// GridPaneのマージンを設定
		GridPane.setMargin(hboxConnect, new Insets(20,20,20,20));
	}

	/*
	 * POJOのメイン関数
	 */
	// Application.launch(args)を呼ぶだけ
	// これがないと、起動できない・・・
	public static void main(String[] args) {
		Application.launch(args);
	}

}