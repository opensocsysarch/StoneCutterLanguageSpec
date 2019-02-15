#-- StoneCutter source file for ISA=BasicRISC.ISA


# Instruction Formats
instformat Arith.if(reg[GPR] ra,reg[GPR] rb,reg[GPR] rt,enc opc,
                    enc func,imm imm)
instformat ReadCtrl.if(reg[GPR] ra,reg[CTRL] rb,reg[GPR] rt,enc opc,
                    enc func,imm imm)
instformat WriteCtrl.if(reg[GPR] ra,reg[GPR] rb,reg[CTRL] rt,enc opc,
                    enc func,imm imm)

# Register Class Definitions
regclass GPR( u64 r0, u64 r1, u64 r2, u64 r3, u64 r4, u64 r5, u64 r6,
              u64 r7, u64 r8, u64 r9, u64 r10, u64 r11, u64 r12, u64 r13,
              u64 r14, u64 r15, u64 r16, u64 r17, u64 r18, u64 r19, u64 r20,
              u64 r21, u64 r22, u64 r23, u64 r24, u64 r25, u64 r26, u64 r27,
              u64 r28, u64 r29, u64 r30, u64 r31 )
regclass CTRL( u64 pc, u64 exc, u64 ne, u64 eq, u64 gt, u64 lt, u64 gte,
               u64 lte, u64 sp, u64 fp, u64 rp )


# Instruction Definitions
# add
def add( ra rb rt imm )
{
  rt = ra + rb
}

# sub
def sub( ra rb rt imm )
{
  rt = ra - rb
}

# mul
def mul( ra rb rt imm )
{
  rt = ra * rb
}

# div
def div( ra rb rt imm )
{
  rt = ra / rb
}

# divu
def divu( ra rb rt imm )
{
  rt = ra / rb
}

# sll
def sll( ra rb rt imm )
{
  rt = ra << rb
}

# srl
def srl( ra rb rt imm )
{
  rt = ra >> rb
}

# sra
def sra( ra rb rt imm )
{
  rt = ra >> rb
}

# and
def and( ra rb rt imm )
{
  rt = ra & rb
}

# or
def or( ra rb rt imm )
{
  rt = ra | rb
}

# nand
def nand( ra rb rt imm )
{
  rt = NOT(ra & rb)
}

# nor
def nor( ra rb rt imm )
{
  rt = NOT(ra | rb)
}

# xor
def xor( ra rb rt imm )
{
  rt = ra ^ rb
}

# cmp.ne
def cmp.ne( ra rb rt imm )
{
  if( ra != rb ){
    rt = 2
  }else{
    rt = 0
  }
}

# cmp.eq
def cmp.eq( ra rb rt imm )
{
  if( ra == rb ){
    rt = 3
  }else{
    rt = 0
  }
}

# cmp.gt
def cmp.gt( ra rb rt imm )
{
  if( ra > rb ){
    rt = 4
  }else{
    rt = 0
  }
}

# cmp.lt
def cmp.lt( ra rb rt imm )
{
  if( ra < rb ){
    rt = 5
  }else{
    rt = 0
  }
}

# cmp.gte
def cmp.gte( ra rb rt imm )
{
  if( ra >= rb ){
    rt = 6
  }else{
    rt = 0
  }
}

# cmp.lte
def cmp.lte( ra rb rt imm )
{
  if( ra <= rb ){
    rt = 7
  }else{
    rt = 0
  }
}

# lb
def lb( ra rb rt imm )
{
  rt = SEXT(LOADELEM(ra+imm,8))
}

# lh
def lh( ra rb rt imm )
{
  rt = SEXT(LOADELEM(ra+imm,16))
}

# lw
def lw( ra rb rt imm )
{
  rt = SEXT(LOADELEM(ra+imm,32))
}

# ld
def ld( ra rb rt imm )
{
  rt = LOADELEM(ra+imm,64)
}

# sb
def sb( ra rb rt imm )
{
  STOREELEM(ra,rt+imm,8)
}

# sh
def sh( ra rb rt imm )
{
  STOREELEM(SEXT(ra),rt+imm,16)
}

# sw
def sw( ra rb rt imm )
{
  STOREELEM(SEXT(ra),rt+imm,32)
}

# sd
def sd( ra rb rt imm )
{
  STOREELEM(SEXT(ra),rt+imm,64)
}

# lbu
def lbu( ra rb rt imm )
{
  rt = ZEXT(LOADELEM(ra+imm,8))
}

# lhu
def lhu( ra rb rt imm )
{
  rt = ZEXT(LOADELEM(ra+imm,16))
}

# lwu
def lwu( ra rb rt imm )
{
  rt = ZEXT(LOADELEM(ra+imm,32))
}

# sbu
def sbu( ra rb rt imm )
{
  STOREELEM(ZEXT(ra),rt+imm,8)
}

# shu
def shu( ra rb rt imm )
{
  STOREELEM(ZEXT(ra),rt+imm,16)
}

# swu
def swu( ra rb rt imm )
{
  STOREELEM(ZEXT(ra),rt+imm,32)
}

# not
def not( ra rb rt imm )
{
  rt = NOT(ra)
}

# bra
def bra( ra rb rt imm )
{
  pc = rt
}

# br
def br( ra rb rt imm )
{
  pc = SEXT(pc + rt)
}

# cadd
def cadd( ra rb rt imm )
{
  rt = ra + rb
}

# brac
def brac( ra rb rt imm )
{
  if( ra == rb ){
    pc = rt
  }else{
    pc = pc + 4
  }
}

# brc
def brc( ra rb rt imm )
{
  if( ra == rb ){
    pc = pc + rt
  }else{
    pc = pc + 4
  }
}

# ladd
def ladd( ra rb rt imm )
{
  rt = ra + rb
}

# brr
def brr( ra rb rt imm )
{
  pc = rt
}

