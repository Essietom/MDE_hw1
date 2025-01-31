package jetbrain.mps.cryptoexchange.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_orderType extends EnumerationDescriptorBase {

  public EnumerationDescriptor_orderType() {
    super(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x3a77f2ff09d97bf6L, "orderType", "r:984aa0d0-cdbe-4539-96fb-298ff1435c32(jetbrain.mps.cryptoexchange.structure)/4213103153624218614");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_buy_0 = new EnumerationDescriptor.MemberDescriptor("buy", "buy", 0x3a77f2ff09d97bfcL, "r:984aa0d0-cdbe-4539-96fb-298ff1435c32(jetbrain.mps.cryptoexchange.structure)/4213103153624218620");
  private final EnumerationDescriptor.MemberDescriptor myMember_sell_0 = new EnumerationDescriptor.MemberDescriptor("sell", "sell", 0x3a77f2ff09d97bfeL, "r:984aa0d0-cdbe-4539-96fb-298ff1435c32(jetbrain.mps.cryptoexchange.structure)/4213103153624218622");
  private final EnumerationDescriptor.MemberDescriptor myMember_leverageLong_0 = new EnumerationDescriptor.MemberDescriptor("leverageLong", "leverageLong", 0x3a77f2ff09e3a422L, "r:984aa0d0-cdbe-4539-96fb-298ff1435c32(jetbrain.mps.cryptoexchange.structure)/4213103153624884258");
  private final EnumerationDescriptor.MemberDescriptor myMember_leverageShort_0 = new EnumerationDescriptor.MemberDescriptor("leverageShort", "leverageShort", 0x3a77f2ff09e3a426L, "r:984aa0d0-cdbe-4539-96fb-298ff1435c32(jetbrain.mps.cryptoexchange.structure)/4213103153624884262");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x885932350df545d0L, 0xbc76936b0ff5f304L, 0x3a77f2ff09d97bf6L, 0x3a77f2ff09d97bfcL, 0x3a77f2ff09d97bfeL, 0x3a77f2ff09e3a422L, 0x3a77f2ff09e3a426L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_buy_0, myMember_sell_0, myMember_leverageLong_0, myMember_leverageShort_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "buy":
        return myMember_buy_0;
      case "sell":
        return myMember_sell_0;
      case "leverageLong":
        return myMember_leverageLong_0;
      case "leverageShort":
        return myMember_leverageShort_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
