package water.android.io.pattern_factory.example_2.abstracted;

import water.android.io.pattern_factory.example_2.bean.button.Button;
import water.android.io.pattern_factory.example_2.bean.text.Text;
import water.android.io.pattern_factory.example_2.bean.button.WindowButton;
import water.android.io.pattern_factory.example_2.bean.text.WindowText;

public class WindowFactory extends AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Text createText() {
        return new WindowText();
    }

}
