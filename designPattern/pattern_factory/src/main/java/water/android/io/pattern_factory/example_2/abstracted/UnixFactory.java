package water.android.io.pattern_factory.example_2.abstracted;

import water.android.io.pattern_factory.example_2.bean.button.Button;
import water.android.io.pattern_factory.example_2.bean.text.Text;
import water.android.io.pattern_factory.example_2.bean.button.UnixButton;
import water.android.io.pattern_factory.example_2.bean.text.UnixText;

public class UnixFactory extends AbstractFactory {

    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Text createText() {
        return new UnixText();
    }

}
