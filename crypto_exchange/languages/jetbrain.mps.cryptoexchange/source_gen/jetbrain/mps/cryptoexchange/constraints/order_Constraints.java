package jetbrain.mps.cryptoexchange.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class order_Constraints extends BaseConstraintsDescriptor {
  public order_Constraints() {
    super(CONCEPTS.order$wK);
  }

  public static class Amount_Property extends BasePropertyConstraintsDescriptor {
    public Amount_Property(ConstraintsDescriptor container) {
      super(PROPS.amount$BBkE, container, false, false, true);
    }
    @Override
    public boolean validateValue(SNode node, Object propertyValue, CheckingNodeContext checkingNodeContext) {
      boolean result = staticValidateProperty(node, SPropertyOperations.castString(propertyValue));
      if (!(result) && checkingNodeContext != null) {
        checkingNodeContext.setBreakingNode(new SNodePointer("r:c2acfc4e-bba7-4c28-bd45-597d78d07316(jetbrain.mps.cryptoexchange.constraints)", "4293340948030041053"));
      }
      return result;
    }
    private static boolean staticValidateProperty(SNode node, String propertyValue) {
      if ((SLinkOperations.getTarget(node, LINKS.account$9L69) == null) || isEmptyString(SPropertyOperations.getString(node, PROPS.amount$BBkE))) {
        return true;
      }
      for (SNode bal : SLinkOperations.getChildren(SLinkOperations.getTarget(node, LINKS.account$9L69), LINKS.TokenBalance$iIxI)) {
        if (SPropertyOperations.hasValue(bal, PROPS.name$MnvL, SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(node, LINKS.TokenPair$9Qvw), LINKS.TokenA$WY9C), PROPS.name$MnvL))) {
          if (new Float(SPropertyOperations.getString(bal, PROPS.balance$WJS_)) < new Float(SPropertyOperations.getString(node, PROPS.amount$BBkE))) {
            return false;
          }
        }
      }
      return true;
    }
    private static boolean isEmptyString(String str) {
      return str == null || str.isEmpty();
    }
  }
  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(PROPS.amount$BBkE, new Amount_Property(this));
    return properties;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept order$wK = MetaAdapterFactory.getConcept(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x2a868524b103cefcL, "jetbrain.mps.cryptoexchange.structure.order");
  }

  private static final class PROPS {
    /*package*/ static final SProperty amount$BBkE = MetaAdapterFactory.getProperty(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x2a868524b103cefcL, 0x3a77f2ff0a4b1d28L, "amount");
    /*package*/ static final SProperty balance$WJS_ = MetaAdapterFactory.getProperty(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x4ae7a0d4d1aa573bL, 0x4ae7a0d4d1aa5741L, "balance");
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink account$9L69 = MetaAdapterFactory.getReferenceLink(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x2a868524b103cefcL, 0x2a868524b103cf06L, "account");
    /*package*/ static final SReferenceLink TokenPair$9Qvw = MetaAdapterFactory.getReferenceLink(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x2a868524b103cefcL, 0x2a868524b103cf08L, "TokenPair");
    /*package*/ static final SReferenceLink TokenA$WY9C = MetaAdapterFactory.getReferenceLink(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x4ae7a0d4d1aa5749L, 0x4ae7a0d4d1aa5752L, "TokenA");
    /*package*/ static final SContainmentLink TokenBalance$iIxI = MetaAdapterFactory.getContainmentLink(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x151908d59864d18bL, 0x4ae7a0d4d1aa5743L, "TokenBalance");
  }
}
