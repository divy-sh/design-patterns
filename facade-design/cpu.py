class CPU:
    def freeze(self):
        print("freezing cpu...")
    
    def jump(self, pos):
        print(f"jumping to position: {pos}")
    
    def execute(self, instruction):
        print(f"executing instruction: {instruction}")